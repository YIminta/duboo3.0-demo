package com.yimint.provider.controller;

import com.yimint.provider.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;
}
