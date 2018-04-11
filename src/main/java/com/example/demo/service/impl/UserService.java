package com.example.demo.service.impl;

import com.example.demo.dao.IUserDao;
import com.example.demo.model.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findUserList() {
        return userDao.findUserList();
    }

}
