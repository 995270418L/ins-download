package com.steve.insdownloader.entities.basic;

/**
 * Created by steve on 17-7-11.
 */
public class User {

    private String id;
    private String full_name;
    private String profile_picture;
    private String username;

    public User(String name, String id){
        this.id = id;
        this.username = name;
    }
    public User(){

    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }
}
