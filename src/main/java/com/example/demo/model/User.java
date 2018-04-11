package com.example.demo.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/11.
 */
public class User implements Serializable {
    private int userId;					//用户id
    private String userName;			//用户名称

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
