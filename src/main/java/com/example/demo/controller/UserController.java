package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/4/11.
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/user/list")
    public List<User> findList(HttpServletRequest request){
        return userService.findUserList();
    }
}
