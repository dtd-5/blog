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
@TableName("m_category")
public class MCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 标题
     */
    @TableField("name")
    private String name;

    /**
     * 内容描述
     */
    @TableField("content")
    private String content;

    @TableField("summary")
    private String summary;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 该分类的内容数量
     */
    @TableField("post_count")
    private Integer postCount;

    /**
     * 排序编码
     */
    @TableField("order_num")
    private Integer orderNum;

    /**
     * 父级分类的ID
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * SEO关键字
     */
    @TableField("meta_keywords")
    private String metaKeywords;

    /**
     * SEO描述内容
     */
    @TableField("meta_description")
    private String metaDescription;

    /**
     * 创建日期
     */
    @TableField("created")
    private LocalDateTime created;

    @TableField("modified")
    private LocalDateTime modified;

    @TableField("status")
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MCategory{" +
            "id = " + id +
            ", name = " + name +
            ", content = " + content +
            ", summary = " + summary +
            ", icon = " + icon +
            ", postCount = " + postCount +
            ", orderNum = " + orderNum +
            ", parentId = " + parentId +
            ", metaKeywords = " + metaKeywords +
            ", metaDescription = " + metaDescription +
            ", created = " + created +
            ", modified = " + modified +
            ", status = " + status +
        "}";
    }
}
