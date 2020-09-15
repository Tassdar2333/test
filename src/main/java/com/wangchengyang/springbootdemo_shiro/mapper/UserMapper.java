package com.wangchengyang.springbootdemo_shiro.mapper;

import com.wangchengyang.springbootdemo_shiro.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User findByName(String name);

    public User findById(Integer id);
}
