package com.steve.insdownloader.entities.extend;

import java.util.List;


/**
 * Created by steve on 17-7-11.
 */
public class Carousel_media_single {

    private Images images;

    private List<User_Position> users_in_photo;

    private String type;

    private Videos videos;

    public List<User_Position> getUsers_in_photo() {
        return users_in_photo;
    }

    public void setUsers_in_photo(List<User_Position> users_in_photo) {
        this.users_in_photo = users_in_photo;
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


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
