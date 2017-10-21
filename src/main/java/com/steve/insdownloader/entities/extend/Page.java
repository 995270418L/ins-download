package com.steve.insdownloader.entities.extend;

import java.util.List;

/**
 * Created by steve on 17-7-11.
 * 获取json数据后封装的对象
 */
public class Page {

    private List<Items_single> items;

    private boolean more_available;

    private String status;

    public List<Items_single> getItems() {
        return items;
    }

    public void setItems(List<Items_single> items) {
        this.items = items;
    }

    public boolean isMore_available() {
        return more_available;
    }

    public void setMore_available(boolean more_available) {
        this.more_available = more_available;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
