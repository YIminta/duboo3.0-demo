package com.yimint.provider.service;

import com.yimint.common.domain.User;
import com.yimint.common.interfaces.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "testService")
public class TestServiceImpl implements TestService {
    @Override
    public User getUser(String uId) {
        return User.builder().id(uId).name("朱志超").build();
    }

}
