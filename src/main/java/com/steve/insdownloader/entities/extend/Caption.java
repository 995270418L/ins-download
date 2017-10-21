package com.steve.insdownloader.entities.extend;


import com.steve.insdownloader.entities.basic.User;

/**
 * Created by steve on 17-7-11.
 * 标题
 */
public class Caption {
    private String id;
    private String text;
    private String created_time;
    private User from;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }
}
