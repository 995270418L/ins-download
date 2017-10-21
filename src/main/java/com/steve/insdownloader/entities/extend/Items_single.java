package com.steve.insdownloader.entities.extend;

import com.steve.insdownloader.entities.basic.User;

import java.util.List;

/**
 * Created by steve on 17-7-11.
 */
public class Items_single {

    private String id;
    private User user;
    private String created_time;
    private Caption caption;
    private Likes likes;
    private Comments comments;
    private boolean can_view_comments;
    private boolean can_delete_comments;
    private String type;
    private String link;
    private String location;
    private String alt_media_url;
    private List<Carousel_media_single> carousel_media;
    private Images images;
    private Videos videos;
    private long video_views;

    public long getVideo_views() {
        return video_views;
    }

    public void setVideo_views(long video_views) {
        this.video_views = video_views;
    }

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public boolean isCan_view_comments() {
        return can_view_comments;
    }

    public void setCan_view_comments(boolean can_view_comments) {
        this.can_view_comments = can_view_comments;
    }

    public boolean isCan_delete_comments() {
        return can_delete_comments;
    }

    public void setCan_delete_comments(boolean can_delete_comments) {
        this.can_delete_comments = can_delete_comments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAlt_media_url() {
        return alt_media_url;
    }

    public void setAlt_media_url(String alt_media_url) {
        this.alt_media_url = alt_media_url;
    }

    public List<Carousel_media_single> getCarousel_media() {
        return carousel_media;
    }

    public void setCarousel_media(List<Carousel_media_single> carousel_media) {
        this.carousel_media = carousel_media;
    }
}
