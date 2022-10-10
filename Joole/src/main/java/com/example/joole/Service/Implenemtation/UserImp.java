package com.example.joole.Service.Implenemtation;

import com.example.joole.Entity.Product;
import com.example.joole.Entity.User;
import com.example.joole.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserImp {
    @Autowired
    UserRepository userRepository;

    public User findOneById(Integer Id) {
        return userRepository.findById(Id).orElse(null);
    }
}
