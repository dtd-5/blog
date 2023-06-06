package com.example.blog.eblog.entity;

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
@TableName("m_user_action")
public class MUserAction implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private String userId;

    /**
     * 动作类型
     */
    @TableField("action")
    private String action;

    /**
     * 得分
     */
    @TableField("point")
    private Integer point;

    /**
     * 关联的帖子ID
     */
    @TableField("post_id")
    private String postId;

    /**
     * 关联的评论ID
     */
    @TableField("comment_id")
    private String commentId;

    @TableField("created")
    private LocalDateTime created;

    @TableField("modified")
    private LocalDateTime modified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
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
        return "MUserAction{" +
            "id = " + id +
            ", userId = " + userId +
            ", action = " + action +
            ", point = " + point +
            ", postId = " + postId +
            ", commentId = " + commentId +
            ", created = " + created +
            ", modified = " + modified +
        "}";
    }
}
