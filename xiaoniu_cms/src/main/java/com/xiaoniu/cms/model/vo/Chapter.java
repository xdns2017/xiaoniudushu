package com.xiaoniu.cms.model.vo;

/**
 * 书的章节、一般书分为5个章节
 * Created by wzyoung on 2017/1/8.
 */
public class Chapter {
    // 第几章节
    private int num;
    // 每章节内容
    private String content;
    // 每章节MP3 URL 存储于云上
    private String mp3;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMp3() {
        return mp3;
    }

    public void setMp3(String mp3) {
        this.mp3 = mp3;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "num=" + num +
                ", content='" + content + '\'' +
                ", mp3='" + mp3 + '\'' +
                '}';
    }
}
