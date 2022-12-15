package com.yimint.consumer.service;

import com.yimint.common.domain.User;
import com.yimint.common.interfaces.TestService;
import com.yimint.common.interfaces.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @DubboReference(group = "userService")
    private UserService userService;
    @DubboReference(group = "testService")
    private TestService testService;
    public String createOrder() {
        User user = userService.getUser("1");
        System.out.println("创建订单");

        return user.toString() + " succeeded in creating the order";
    }

    public String testOrder(){
        User user = testService.getUser("2");
        System.out.println("测试订单");
        return user.toString() + " succeeded in testing the order";
    }
}
