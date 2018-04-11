package com.example.demo.dao.impl;

import com.example.demo.dao.IUserDao;
import com.example.demo.dao.rowmapper.UserRowMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11.
 */
@Repository
public class UserDao implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserRowMapper userRowMapper;

    
    @Override
    public List<User> findUserList() {
        String sql="select * from t_user";
        List<User> list=jdbcTemplate.query(sql,new Object[]{},userRowMapper);
        return list;
    }
}

