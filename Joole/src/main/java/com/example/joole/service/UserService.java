package com.example.joole.service;

import com.example.joole.Entity.User;

public interface UserService {
    User findOneByID(Long id);

    User createUser(User user);

    User findAllByUserNameContaining(String containStr);

    User findUserByUserName(String name);
}
