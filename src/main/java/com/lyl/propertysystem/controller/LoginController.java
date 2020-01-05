package com.lyl.propertysystem.controller;

import com.lyl.propertysystem.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("/login.html")
    public String login(){
        userService.select();
        System.out.println("登录成功!");
        return "login";
    }
}
