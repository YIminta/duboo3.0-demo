package com.yimint.common.interfaces;

import com.yimint.common.domain.User;
import com.yimint.common.interfaces.TestService;


public class TestServiceMock implements TestService {
    @Override
    public User getUser(String uId) {
        return User.builder().id(uId).name("朱志超报错了").build();
    }

}
