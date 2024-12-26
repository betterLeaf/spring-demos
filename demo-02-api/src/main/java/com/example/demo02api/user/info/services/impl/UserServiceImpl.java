package com.example.demo02api.user.info.services.impl;

import com.example.demo02api.user.info.mapper.UserMapper;
import com.example.demo02api.user.info.pojo.User;
import com.example.demo02api.user.info.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserMapper userMapper;
//
//    @Override
//    public User findById(Integer id){
//        return userMapper.findById(id);
//    }

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

}
