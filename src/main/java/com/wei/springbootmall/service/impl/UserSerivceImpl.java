package com.wei.springbootmall.service.impl;

import com.wei.springbootmall.dao.UserDao;
import com.wei.springbootmall.dto.UserRegisterRequest;
import com.wei.springbootmall.model.User;
import com.wei.springbootmall.service.UserService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSerivceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
