package com.example.blog.eblog.service;

import com.example.blog.eblog.entity.MPost;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 橘子
 * @since 2023-06-06
 */
public interface IMPostService extends IService<MPost> {

    void initIndexWeekRank();

    void zunionAndStoreLast7DayForWeekRank();

    void hashCachePostIdAndTitle(MPost post, StringRedisTemplate redisTemplate);
}
