package com.controller;

import com.pojo.User;
import com.pojo.UserLogin;
import com.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;



    @RequestMapping("goLogon.do")
    public String goLogon(){
        return "login";
    }

    @RequestMapping("login.do")
    public String logon(UserLogin userLogin, Model model ){
        User u = userLoginService.login(userLogin);
        model.addAttribute("loginMessage","欢迎"+u.getUser_name()+"回来！");
        return "login";
    }
}
