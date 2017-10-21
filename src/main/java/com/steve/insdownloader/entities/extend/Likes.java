package com.steve.insdownloader.entities.extend;

import com.steve.insdownloader.entities.basic.User;

import java.util.List;

/**
 * Created by steve on 17-7-11.
 * 喜欢
 */
public class Likes {

    private List<User> data;
    private long count;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
