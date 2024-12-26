package com.example.demo02api.user.info.controller;

import com.example.demo02api.user.info.pojo.User;
import com.example.demo02api.user.info.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/findById")
    public User findById(Integer id){
        return   userService.findById(id);
    }
}
