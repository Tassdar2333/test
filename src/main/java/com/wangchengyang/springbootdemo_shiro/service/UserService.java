package com.wangchengyang.springbootdemo_shiro.service;

import com.wangchengyang.springbootdemo_shiro.mapper.UserMapper;
import com.wangchengyang.springbootdemo_shiro.pojo.User;
import com.wangchengyang.springbootdemo_shiro.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper mapper;

    @Override
    public User findByName(String name) {
        return mapper.findByName(name);
    }

    @Override
    public User findById(Integer id) {
        return mapper.findById(id);
    }
}
