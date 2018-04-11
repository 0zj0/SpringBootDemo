package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/4/10.
 */
@Controller
@EnableAutoConfiguration
public class SimpleController {

    @RequestMapping("home")
    @ResponseBody
    String home(){
        return "Hello World!";
    }
}
