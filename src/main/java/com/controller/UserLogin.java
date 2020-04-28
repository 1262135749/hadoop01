package com.controller;

import com.pojo.User;
import com.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLogin {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping
    public User UserLogin(User user){
        return userLoginService.login(user);
    }
}
