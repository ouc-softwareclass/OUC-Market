package com.lenovo.myoucapp;

<<<<<<< HEAD
import org.litepal.crud.DataSupport;

public class ItemInfo extends DataSupport {
    private Integer id;
    private String name;
    private String introduction; //
=======
/*
???????????????????????????????????????
 */

public class ItemInfo {
    private Integer id;
    private String name;
    private String introduction;
>>>>>>> search

    public String getName() {
        return name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
