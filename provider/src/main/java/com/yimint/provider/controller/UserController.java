package com.yimint.provider.controller;

import com.yimint.provider.domain.User;
import com.yimint.provider.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{uid}")
    public User getUser(@PathVariable String uid) {
        return userService.getUser(uid);
    }
}
