package com.steve.insdownloader.entities.basic;

/**
 * Created by steve on 17-7-15.
 * 单个人的贴子图片资源
 */

public class SingleSource {

    private String is_video;
    private String captaion;
    private String display_url;
    private String video_url;

    public SingleSource(String display_url, String caption, String is_video){
        this.captaion = caption;
        this.display_url = display_url;
        this.is_video = is_video;
    }

    public SingleSource(){}

    public String getIs_video() {
        return is_video;
    }

    public void setIs_video(String is_video) {
        this.is_video = is_video;
    }

    public String getCaptaion() {
        return captaion;
    }

    public void setCaptaion(String captaion) {
        this.captaion = captaion;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    @Override
    public String toString() {
        return getIs_video() + "\t" + getCaptaion() +"\t" + getDisplay_url() + "\t" + getVideo_url();
    }
}
