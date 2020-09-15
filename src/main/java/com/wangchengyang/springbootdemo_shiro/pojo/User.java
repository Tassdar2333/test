package com.wangchengyang.springbootdemo_shiro.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data

public class User {

    private Integer id;
    private String name;
    private String password;
    private String perms;

}
