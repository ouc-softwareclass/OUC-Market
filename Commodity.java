<<<<<<< HEAD
package com.lenovo.myoucapp;

import android.media.Image;

//得到商品的图片和名称
/*
定义商品类=图片+信息+价格
 */
public class Commodity {
    private String name;
    private int imageId;
    private String price;
    private String info;
    private Image[] detail;
    private User owner;
    private int id;
    private boolean state;
    private Comment[] comment;

    public Commodity(String name, int imageId,String price){
        this.imageId=imageId;
        this.name=name;
        this.price=price;
//        this.info = info;
//        this.owner = owner;
//        this.detail = detail;

    }

    public String getName() {

        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getPrice() {
        return price;
    }

    public String getInfo(){
        return info;
    }

    public Image[] getDetail(){
        return detail;
    }

    public User getOwner(){
        return owner;
    }

    public int getId(){
        return id;
    }

    public boolean getState(){
        return state;
    }

    public Comment[] getComment(){
        return comment;
    }

}
=======
package com.lenovo.myoucapp;

import android.media.Image;

//得到商品的图片和名称
/*
定义商品类=图片+信息+价格
 */
public class Commodity {
    private String name;
    private int imageId;
    private String price;
    private String info;
    private Image[] detail;
    private User owner;
    private int id;
    private boolean state;
    private Comment[] comment;

    public Commodity(String name, int imageId,String price){
        this.imageId=imageId;
        this.name=name;
        this.price=price;
//        this.info = info;
//        this.owner = owner;
//        this.detail = detail;

    }

    public String getName() {

        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getPrice() {
        return price;
    }

    public String getInfo(){
        return info;
    }

    public Image[] getDetail(){
        return detail;
    }

    public User getOwner(){
        return owner;
    }

    public int getId(){
        return id;
    }

    public boolean getState(){
        return state;
    }

    public Comment[] getComment(){
        return comment;
    }

}
>>>>>>> search
