package com.yimint.consumer.service;

import com.yimint.consumer.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private RestTemplate restTemplate;

    public String createOrder(){
        User user = restTemplate.getForObject("http://localhost:8081/user/1", User.class);
        System.out.println("创建订单");

        return user.toString()+" succeeded in creating the order";
    }
}
