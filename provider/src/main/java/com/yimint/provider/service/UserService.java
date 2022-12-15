package com.yimint.provider.service;

import com.yimint.provider.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(String uId) {
        return User.builder().id(uId).name("张三").build();
    }
}
