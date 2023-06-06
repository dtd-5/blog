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
@TableName("m_user")
public class MUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 昵称
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 邮件
     */
    @TableField("email")
    private String email;

    /**
     * 手机电话
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 积分
     */
    @TableField("point")
    private Integer point;

    /**
     * 个性签名
     */
    @TableField("sign")
    private String sign;

    /**
     * 性别
     */
    @TableField("gender")
    private String gender;

    /**
     * 微信号
     */
    @TableField("wechat")
    private String wechat;

    /**
     * vip等级
     */
    @TableField("vip_level")
    private Integer vipLevel;

    /**
     * 生日
     */
    @TableField("birthday")
    private LocalDateTime birthday;

    /**
     * 头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 内容数量
     */
    @TableField("post_count")
    private Integer postCount;

    /**
     * 评论数量
     */
    @TableField("comment_count")
    private Integer commentCount;

    /**
     * 状态
     */
    @TableField("status")
    private Byte status;

    /**
     * 最后的登陆时间
     */
    @TableField("lasted")
    private LocalDateTime lasted;

    /**
     * 创建日期
     */
    @TableField("created")
    private LocalDateTime created;

    /**
     * 最后修改时间
     */
    @TableField("modified")
    private LocalDateTime modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public LocalDateTime getLasted() {
        return lasted;
    }

    public void setLasted(LocalDateTime lasted) {
        this.lasted = lasted;
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
        return "MUser{" +
            "id = " + id +
            ", username = " + username +
            ", password = " + password +
            ", email = " + email +
            ", mobile = " + mobile +
            ", point = " + point +
            ", sign = " + sign +
            ", gender = " + gender +
            ", wechat = " + wechat +
            ", vipLevel = " + vipLevel +
            ", birthday = " + birthday +
            ", avatar = " + avatar +
            ", postCount = " + postCount +
            ", commentCount = " + commentCount +
            ", status = " + status +
            ", lasted = " + lasted +
            ", created = " + created +
            ", modified = " + modified +
        "}";
    }
}
