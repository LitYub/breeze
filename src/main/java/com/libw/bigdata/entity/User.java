package com.libw.bigdata.entity;

public class User {

    private int user_id;
    private String user_name;
    private String user_password;
    private String user_actor;
    private String user_email;

    public String getUser_actor() {
        return user_actor;
    }

    public void setUser_actor(String user_actor) {
        this.user_actor = user_actor;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
