package com.lenovo.myoucapp;

import android.media.Image;

public class User {
    private Image userImage;
    private String userId;
    private String password;
    private String adress;
    private String userName;
    private String contact;
    private Commodity upload;
    private Commodity collection;

    public User(Image userImage,String userId,String password,
                String adress,String userName,String contact,Commodity upload,Commodity collection){
        this.userImage=userImage;
        this.userId=userId;
        this.password=password;
        this.adress=adress;
        this.userName=userName;
        this.contact=contact;
        this.upload=upload;
        this.collection=collection;
    }
    private Image getUserImage(){
        return userImage;
    }
    private String getUserId(){
        return userId;
    }
    private String getPassword(){
        return password;
    }
    private String getAdress(){
        return adress;
    }
    private String getUserName(){
        return userName;
    }
    private String getContact(){
        return contact;
    }
    private Commodity getUpload(){
        return upload;
    }
    private Commodity getCollection(){
        return collection;
    }

}
