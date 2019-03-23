package com.joi.school.fitness.forum.datasource;

import com.joi.school.fitness.user.FitnessUser;

import cn.bmob.v3.BmobObject;

/**
 * Post JavaBean.
 *
 * @author 泽乾
 * createAt 2019/3/22 0022 10:37
 */
public class Post extends BmobObject {
    private FitnessUser author;
    private String title;
    private String content;

    public FitnessUser getAuthor() {
        return author;
    }

    public void setAuthor(FitnessUser author) {
        this.author = author;
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
}