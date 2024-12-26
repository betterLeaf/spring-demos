package com.example.demo02api.user.info.controller;

import com.example.demo02api.user.info.pojo.User;
import com.example.demo02api.user.info.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        User result = userService.addUser(user);
        return "1";
//        if (result > 0) {
//            return "User created successfully!";
//        } else {
//            return "Failed to create user.";
//        }
//        return userService.addUser(user);
    }
}
