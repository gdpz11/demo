package com.example.joole.Service.Implenemtation;

import com.example.joole.Service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserImpTest {


    @Autowired
    UserService service;

    @Test
    void findOneById() {

    }

    @Test
    void getUser() {
    }

    @Test
    void deleteUser() {
        service.createUser();
        service.deleteUser(1);
    }

    @Test
    void createUser() {
        service.createUser();
    }
}