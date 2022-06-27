package com.wei.springbootmall.service;

import com.wei.springbootmall.dto.UserRegisterRequest;
import com.wei.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
