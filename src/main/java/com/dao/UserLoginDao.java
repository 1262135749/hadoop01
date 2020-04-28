package com.dao;

import com.pojo.User;
import com.pojo.UserLogin;

public interface UserLoginDao {

    public User login(UserLogin user);
}
