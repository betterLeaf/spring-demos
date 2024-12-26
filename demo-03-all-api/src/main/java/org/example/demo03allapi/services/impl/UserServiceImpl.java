package org.example.demo03allapi.services.impl;

import org.example.demo03allapi.mapper.UserMapper;
import org.example.demo03allapi.pojo.User;
import org.example.demo03allapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public void register(String username, String password) {
         userMapper.register(username, password);
    }




    @Override
    public User findByName(String username) {
        User u =  userMapper.findByName(username);
        return u;
    }

}
