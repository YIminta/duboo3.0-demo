package com.yimint.provider.service;

import com.yimint.common.domain.User;
import com.yimint.common.interfaces.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;

//@DubboService(group = "userService")
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String uId) {
        return User.builder().id(uId).name("张三").build();
    }
}
