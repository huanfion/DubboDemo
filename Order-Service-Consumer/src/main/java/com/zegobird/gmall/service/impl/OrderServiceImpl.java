package com.zegobird.gmall.service.impl;


import com.zegobird.bean.UserAddress;
import com.zegobird.service.OrderService;
import com.zegobird.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 *      1）导入dubbo 依赖
 *      2)引入操作zookeeper的客户端
 * 2.让服务消费者去注册中心订阅服务提供者地址
 * @author huanfion
 * @version 1.0
 * @date 2019/10/16 11:26
 */

public class OrderServiceImpl implements OrderService {
    @Reference
    private UserService userService;
    @Override
    public void initOrder(String userId) {
        //1.查询用户的收货地址
        List<UserAddress> addressList = userService.getAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress);
        }

    }
}
