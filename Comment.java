package com.lenovo.myoucapp;

import android.icu.text.SimpleDateFormat;

import java.util.Date;

public class Comment {
    private int itemId;
    private int userId;
    private String time;
    private String comments;

    public Comment(int itemId, int userId, String comments)
    {
        this.itemId=itemId;
        this.userId=userId;
        this.comments=comments;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss" );
        this.time=simpleDateFormat.format(date);
        //this.time=time;

    }

    public int getItemId() {
        return itemId;
    }

    public int getUserId() {
        return userId;
    }

    public String getComments() {
        return comments;
    }

    public String getTime() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss" );
        time=simpleDateFormat.format(date);
        return time;
    }
}
