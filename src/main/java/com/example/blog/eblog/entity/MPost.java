package com.example.blog.eblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 橘子
 * @since 2023-06-06
 */
@TableName("m_post")
public class MPost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 标题
     */
    @TableField("title")
    private String title;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

    /**
     * 编辑模式：html可视化，markdown ..
     */
    @TableField("edit_mode")
    private String editMode;

    @TableField("category_id")
    private Long categoryId;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 支持人数
     */
    @TableField("vote_up")
    private Integer voteUp;

    /**
     * 反对人数
     */
    @TableField("vote_down")
    private Integer voteDown;

    /**
     * 访问量
     */
    @TableField("view_count")
    private Integer viewCount;

    /**
     * 评论数量
     */
    @TableField("comment_count")
    private Integer commentCount;

    /**
     * 是否为精华
     */
    @TableField("recommend")
    private Boolean recommend;

    /**
     * 置顶等级
     */
    @TableField("level")
    private Byte level;

    /**
     * 状态
     */
    @TableField("status")
    private Byte status;

    /**
     * 创建日期
     */
    @TableField("created")
    private LocalDateTime created;

    /**
     * 最后更新日期
     */
    @TableField("modified")
    private LocalDateTime modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(Integer voteUp) {
        this.voteUp = voteUp;
    }

    public Integer getVoteDown() {
        return voteDown;
    }

    public void setVoteDown(Integer voteDown) {
        this.voteDown = voteDown;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "MPost{" +
            "id = " + id +
            ", title = " + title +
            ", content = " + content +
            ", editMode = " + editMode +
            ", categoryId = " + categoryId +
            ", userId = " + userId +
            ", voteUp = " + voteUp +
            ", voteDown = " + voteDown +
            ", viewCount = " + viewCount +
            ", commentCount = " + commentCount +
            ", recommend = " + recommend +
            ", level = " + level +
            ", status = " + status +
            ", created = " + created +
            ", modified = " + modified +
        "}";
    }
}
