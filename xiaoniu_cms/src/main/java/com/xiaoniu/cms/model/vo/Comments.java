package com.xiaoniu.cms.model.vo;

import java.util.Date;

/**
 * 评论
 * Created by wzyoung on 2017/1/8.
 */
public class Comments {
    private Date createTime;
    private String content;
    private int likes;
    private String from;
    private boolean isQuestion;
    private boolean isAnswered;
    private String replies;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public boolean isQuestion() {
        return isQuestion;
    }

    public void setQuestion(boolean question) {
        isQuestion = question;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public String getReplies() {
        return replies;
    }

    public void setReplies(String replies) {
        this.replies = replies;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "createTime=" + createTime +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                ", from='" + from + '\'' +
                ", isQuestion=" + isQuestion +
                ", isAnswered=" + isAnswered +
                ", replies='" + replies + '\'' +
                '}';
    }
}
