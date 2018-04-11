package com.example.demo.dao.rowmapper;

import com.example.demo.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/11.
 */
@Component
public class UserRowMapper implements RowMapper<User>{

    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User model=new User();
        model.setUserId(rs.getInt("user_id"));
        model.setUserName(rs.getString("user_name"));
        return model;
    }
}
