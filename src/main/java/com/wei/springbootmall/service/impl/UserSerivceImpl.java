package com.wei.springbootmall.service.impl;

import com.wei.springbootmall.dao.UserDao;
import com.wei.springbootmall.dao.impl.UserDaoImpl;
import com.wei.springbootmall.dto.UserRegisterRequest;
import com.wei.springbootmall.model.User;
import com.wei.springbootmall.service.UserService;
import lombok.experimental.Accessors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserSerivceImpl implements UserService {

    private final static Logger log = LoggerFactory.getLogger(UserDaoImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if (user != null) {
            log.warn("該 email {} 已經被註冊", userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
