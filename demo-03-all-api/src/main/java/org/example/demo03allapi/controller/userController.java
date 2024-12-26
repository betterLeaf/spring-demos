package org.example.demo03allapi.controller;

import org.example.demo03allapi.pojo.Result;
import org.example.demo03allapi.pojo.User;
import org.example.demo03allapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {


    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register( String username,  String password) {
        User u = userService.findByName(username);
        if (u == null) {
            userService.register(username, password);
            return Result.success();
        } else {
            return Result.error("名称已被占用");
        }
    }

}
