package com.example.prince.savelife;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by prince on 19/6/17.
 */


public class RegisterUser{
    private String name;
    private String add;
    private String city;
    private String mob;
    private String blood;
    private String age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAdd(String add){
        this.add=add;
    }
    public String getAdd(){
        return this.add;
    }

    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return this.city;
    }

    public void setMob(String mob){
        this.mob=mob;
    }
    public String getMob(){
        return this.mob;
    }

    public void setBlood(String blood){
        this.blood=blood;
    }
    public String getBlood(){
        return this.blood;
    }

    public void setAge(String age){
        this.age=age;
    }
    public String getAge(){
        return this.age;
    }
}

