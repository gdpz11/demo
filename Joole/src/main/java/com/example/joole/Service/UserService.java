package com.example.joole.Service;

import com.example.joole.Entity.User;

import java.util.List;

public interface UserService {

    //public User save(User user);

    public User findById(Integer id);

    public List<User> findAll();

    public List<User> findByUserType(String type);

}
