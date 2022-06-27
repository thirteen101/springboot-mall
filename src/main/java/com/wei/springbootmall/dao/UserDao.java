package com.wei.springbootmall.dao;

import com.wei.springbootmall.dto.UserRegisterRequest;
import com.wei.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
