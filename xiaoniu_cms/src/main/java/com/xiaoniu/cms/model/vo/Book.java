package com.xiaoniu.cms.model.vo;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 图书的collection
 * Created by wzyoung on 2017/1/8.
 */
@Document
public class Book implements Serializable {
    // 月份
    private int month;
    // id
    @Indexed
    private int bookId;
    //書名
    private String title;
    // 作者
    private String author;
    // 描述
    private String description;
    // 订阅、购买人数
    private int subscribes;
    // 点赞人数
    private int likes;
    // 章节
    private List<Chapter> chapters;
    // 讨论/留言
    private List<Comments> comments;
    private Date createTime;
    // 是否發佈
    private boolean isVisible;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSubscribes() {
        return subscribes;
    }

    public void setSubscribes(int subscribes) {
        this.subscribes = subscribes;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }


    @Override
    public String toString() {
        return "Book{" +
                "month=" + month +
                ", bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", subscribes=" + subscribes +
                ", likes=" + likes +
                ", chapters=" + chapters +
                ", comments=" + comments +
                ", createTime=" + createTime +
                ", isVisible=" + isVisible +
                '}';
    }
}
