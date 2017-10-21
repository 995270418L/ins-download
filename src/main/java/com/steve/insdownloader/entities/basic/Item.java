package com.steve.insdownloader.entities.basic;

/**
 * Created by steve on 17-7-12.
 * content and Url and time
 */
public class Item {

    private String content;
    private String url;
    private String video_url;
    private String time;
    private String max_id;

    public Item(String time, String content, String url, String max_id){
        this.url = url;
        this.content = content;
        this.time = time;
        this.max_id = max_id;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }


    public Item(String url){
        this.url = url;
    }

    public String getMax_id() {
        return max_id;
    }

    public void setMax_id(String max_id) {
        this.max_id = max_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
