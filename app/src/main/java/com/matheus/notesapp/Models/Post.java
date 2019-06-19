package com.matheus.notesapp.Models;

import com.google.firebase.database.ServerValue;

public class Post {
    private String postKey;
    private String title;
    private String description;
    private String picture;
    private String iserId;
    private String userPhoto;
    private Object timeStamp;

    public Post(String title, String description, String picture, String iserId, String userPhoto) {
        this.title = title;
        this.description = description;
        this.picture = picture;
        this.iserId = iserId;
        this.userPhoto = userPhoto;
        this.timeStamp = ServerValue.TIMESTAMP;
    }

    public Post(){

    }

    public String getPostKey(){
        return postKey;
    }

    public void setPostKey(String postKey){
        this.postKey = postKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIserId() {
        return iserId;
    }

    public void setIserId(String iserId) {
        this.iserId = iserId;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public Object getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Object timeStamp) {
        this.timeStamp = timeStamp;
    }
}
