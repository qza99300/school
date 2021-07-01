package com.school.service.impl;

import com.school.UserMapper;
import com.school.entity.User;

import com.school.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public abstract class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
