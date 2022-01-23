package com.springboot.jdbc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.jdbc.entity.User;
import com.springboot.jdbc.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service(value = "UserService")
public class UserService extends ServiceImpl<UserMapper,User> implements IService<User> {

}
