package com.site.blog.my.core.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_blog")
public class Blog {

    @Id
    @GeneratedValue
    private Long blogId;

    @Column(nullable = false)
    private String blogTitle;

    @Column(nullable = false)
    private String blogSubUrl;

    @Column(nullable = false)
    private String blogCoverImage;

    @Column(nullable = false)
    private Integer blogCategoryId;

    @Column(nullable = false)
    private String blogCategoryName;

    @Column(nullable = false)
    private String blogTags;

    @Column(nullable = false)
    private Byte blogStatus;

    @Column(nullable = false)
    private Long blogViews;

    @Column(nullable = false)
    private Byte enableComment;

    @Column(nullable = false)
    private Byte isDeleted;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Date updateTime;

    @Column(nullable = false)
    private String blogContent;

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogSubUrl() {
        return blogSubUrl;
    }

    public void setBlogSubUrl(String blogSubUrl) {
        this.blogSubUrl = blogSubUrl == null ? null : blogSubUrl.trim();
    }

    public String getBlogCoverImage() {
        return blogCoverImage;
    }

    public void setBlogCoverImage(String blogCoverImage) {
        this.blogCoverImage = blogCoverImage == null ? null : blogCoverImage.trim();
    }

    public Integer getBlogCategoryId() {
        return blogCategoryId;
    }

    public void setBlogCategoryId(Integer blogCategoryId) {
        this.blogCategoryId = blogCategoryId;
    }

    public String getBlogCategoryName() {
        return blogCategoryName;
    }

    public void setBlogCategoryName(String blogCategoryName) {
        this.blogCategoryName = blogCategoryName == null ? null : blogCategoryName.trim();
    }

    public String getBlogTags() {
        return blogTags;
    }

    public void setBlogTags(String blogTags) {
        this.blogTags = blogTags == null ? null : blogTags.trim();
    }

    public Byte getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(Byte blogStatus) {
        this.blogStatus = blogStatus;
    }

    public Long getBlogViews() {
        return blogViews;
    }

    public void setBlogViews(Long blogViews) {
        this.blogViews = blogViews;
    }

    public Byte getEnableComment() {
        return enableComment;
    }

    public void setEnableComment(Byte enableComment) {
        this.enableComment = enableComment;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", blogId=").append(blogId);
        sb.append(", blogTitle=").append(blogTitle);
        sb.append(", blogSubUrl=").append(blogSubUrl);
        sb.append(", blogCoverImage=").append(blogCoverImage);
        sb.append(", blogCategoryId=").append(blogCategoryId);
        sb.append(", blogCategoryName=").append(blogCategoryName);
        sb.append(", blogTags=").append(blogTags);
        sb.append(", blogStatus=").append(blogStatus);
        sb.append(", blogViews=").append(blogViews);
        sb.append(", enableComment=").append(enableComment);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", blogContent=").append(blogContent);
        sb.append("]");
        return sb.toString();
    }
}