package com.zegobird.provider.impl;


import com.zegobird.bean.UserAddress;
import com.zegobird.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/16 11:09
 */
@Component
@Service(version = "1.0.0")

public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getAddressList(String userId) {
        List<UserAddress> addressList=new ArrayList<>();

        addressList.add(new UserAddress(1,"广东省广州市海珠区生物工程大厦801","1","huanfion","18569655471","Y"));
        addressList.add(new UserAddress(2,"广东省广州市海珠区生物工程大厦801-3","1","haokong","18569655471","Y"));
        return addressList;
    }
}
