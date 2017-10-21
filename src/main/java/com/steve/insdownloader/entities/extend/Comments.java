package com.steve.insdownloader.entities.extend;

import java.util.List;

/**
 * Created by steve on 17-7-11.
 * 评论
 */
public class Comments {

    private List<Caption> data;
    private long count;

    public List<Caption> getData() {
        return data;
    }

    public void setData(List<Caption> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
