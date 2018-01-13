package com.lyc.service;

import com.lyc.dao.UserMapper;
import com.lyc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user){
        userMapper.insert(user);
    }
}
