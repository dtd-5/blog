package com.example.blog.eblog.service.impl;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.eblog.entity.MPost;
import com.example.blog.eblog.mapper.MPostMapper;
import com.example.blog.eblog.service.IMPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 橘子
 * @since 2023-06-06
 */
@Service
public class MPostServiceImpl extends ServiceImpl<MPostMapper, MPost> implements IMPostService {
//    项目启动时候我们先初始化最近文章的评论数量。基本逻辑如下：
//

//    然后把文章的评论数量作为有序集合的分数，文章id作为ID存储到zset中。
//    本周热议上有标题和评论数量，因此，我们还需要把文章的基本信息存储到redis总。这样得到文章的id之后，我们再从缓存中得到标题等信息，这里我们可以使用hash的结构来存储文章的信息。
//    另外，因为是本周热议，如果文章发表超过7天了之后就没啥用了，所以我们可以给文章的有序集合一个有效时间。超过7天之后就自定删除缓存。
    @Autowired
    StringRedisTemplate redisTemplate;
    /**
     * 初始化首页的周评论排行榜
     */

    @Override
    public void initIndexWeekRank() {
        //    查库获取最近7天的所有文章（或者加多一个条件：评论数量大于0）
        List<MPost> last7DayPosts = this.list(new QueryWrapper<MPost>().ge("created", DateUtil.offsetDay(DateUtil.date(), -7).toJdkDate())
                .select("id, title, user_id, comment_count, view_count, created"));

        System.out.println(last7DayPosts);
        for(MPost post : last7DayPosts){
            //    初始化文章的总评论量
            String key = "day_rank:" + DateUtil.format(post.getCreated(), "yyyyMMdd");
            redisTemplate.opsForZSet().incrementScore(key, post.getId().toString(), post.getCommentCount());
            //    7天后自动过期
            redisTemplate.expire(key, 7, TimeUnit.DAYS);
            //    缓存文章的基本信息（id，标题，评论数量，作者）
            this.hashCachePostIdAndTitle(post, redisTemplate);
        }
        //    做并集
        this.zunionAndStoreLast7DayForWeekRank();
    }

    /**
     * 把最近7天的文章评论数量统计一下
     * 用于首页的7天评论排行榜
     */
    @Override
    public void zunionAndStoreLast7DayForWeekRank() {
        String prifix = "day_rank:";
        List<String> keys  = new ArrayList<>();
        String key = prifix + DateUtil.format(new Date(), DatePattern.PURE_DATE_PATTERN);
        for(int i = -7 ; i < 0; i++) {
            Date date = DateUtil.offsetDay(new Date(), i).toJdkDate();
            keys.add(prifix + DateUtil.format(date, DatePattern.PURE_DATE_PATTERN));
        }
        redisTemplate.opsForZSet().unionAndStore(key, keys, "last_week_rank");
    }

    /**
     * hash结构缓存文章标题和id
     * @param post
     */
    @Override
    public void hashCachePostIdAndTitle(MPost post, StringRedisTemplate redisTemplate) {
        boolean isExist = redisTemplate.hasKey("rank_post_" + post.getId());
        if(!isExist){
            long between = DateUtil.between( DateUtil.date(), Date.from(post.getCreated().atZone(ZoneId.systemDefault()).toInstant()),DateUnit.DAY);
            long expireTime = (7 - between) * 24 * 60 * 60;
            redisTemplate.opsForHash().put("rank_post_" + post.getId(), "post:id", post.getId().toString());
            redisTemplate.opsForHash().put("rank_post_" + post.getId(), "post:title", post.getTitle());
        }
    }
}
