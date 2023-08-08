package com.itheima.service;

import com.itheima.dao.User;

import java.util.List;

public interface UserService {
    List<User> getUserById(String id);
}
