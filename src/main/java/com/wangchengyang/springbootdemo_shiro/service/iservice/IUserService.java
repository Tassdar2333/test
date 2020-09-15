package com.wangchengyang.springbootdemo_shiro.service.iservice;

import com.wangchengyang.springbootdemo_shiro.pojo.User;

public interface IUserService {

    public User findByName(String name);

    public User findById(Integer id);
}
