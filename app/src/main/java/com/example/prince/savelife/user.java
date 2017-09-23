package com.example.prince.savelife;

/**
 * Created by prince on 18/6/17.
 */

public class user {
    private String mob;
    private String name;
    private String password;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setmob(String mob){
        this.mob=mob;
    }
    public String getmob(){
        return this.mob;
    }

    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
}
