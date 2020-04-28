package com.service;

import com.dao.UserLoginDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;


    public User login(User user){
        return userLoginDao.login(user);
    }
}
