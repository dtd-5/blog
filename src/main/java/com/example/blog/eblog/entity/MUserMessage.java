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
@TableName("m_user_message")
public class MUserMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 发送消息的用户ID
     */
    @TableField("from_user_id")
    private Long fromUserId;

    /**
     * 接收消息的用户ID
     */
    @TableField("to_user_id")
    private Long toUserId;

    /**
     * 消息可能关联的帖子
     */
    @TableField("post_id")
    private Long postId;

    /**
     * 消息可能关联的评论
     */
    @TableField("comment_id")
    private Long commentId;

    @TableField("content")
    private String content;

    /**
     * 消息类型
     */
    @TableField("type")
    private Byte type;

    @TableField("created")
    private LocalDateTime created;

    @TableField("modified")
    private LocalDateTime modified;

    @TableField("status")
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MUserMessage{" +
            "id = " + id +
            ", fromUserId = " + fromUserId +
            ", toUserId = " + toUserId +
            ", postId = " + postId +
            ", commentId = " + commentId +
            ", content = " + content +
            ", type = " + type +
            ", created = " + created +
            ", modified = " + modified +
            ", status = " + status +
        "}";
    }
}
