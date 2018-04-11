package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11.
 */
public interface IUserDao {

    List<User> findUserList();
}
