package com.service;

import com.dao.UserLoginDao;
import com.pojo.User;
import com.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;


    public User login(UserLogin userLogin){
        return userLoginDao.login(userLogin);
    }
}
