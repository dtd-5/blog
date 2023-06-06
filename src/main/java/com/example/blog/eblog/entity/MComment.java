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
@TableName("m_comment")
public class MComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评论的内容
     */
    @TableField("content")
    private String content;

    /**
     * 回复的评论ID
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 评论的内容ID
     */
    @TableField("post_id")
    private Long postId;

    /**
     * 评论的用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * “顶”的数量
     */
    @TableField("vote_up")
    private Integer voteUp;

    /**
     * “踩”的数量
     */
    @TableField("vote_down")
    private Integer voteDown;

    /**
     * 置顶等级
     */
    @TableField("level")
    private Byte level;

    /**
     * 评论的状态
     */
    @TableField("status")
    private Byte status;

    /**
     * 评论的时间
     */
    @TableField("created")
    private LocalDateTime created;

    /**
     * 评论的更新时间
     */
    @TableField("modified")
    private LocalDateTime modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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
        return "MComment{" +
            "id = " + id +
            ", content = " + content +
            ", parentId = " + parentId +
            ", postId = " + postId +
            ", userId = " + userId +
            ", voteUp = " + voteUp +
            ", voteDown = " + voteDown +
            ", level = " + level +
            ", status = " + status +
            ", created = " + created +
            ", modified = " + modified +
        "}";
    }
}
