package com.springboot.demo.pojo;

/**
 * @author: Admin
 * @create: 2020/7/8 15:56
 */
public class Users {
    private Integer userid;
    private String username;
    private String usersex;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }
}