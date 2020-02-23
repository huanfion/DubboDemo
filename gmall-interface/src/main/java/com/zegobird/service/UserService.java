package com.zegobird.service;

import com.zegobird.bean.UserAddress;

import java.util.List;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/16 11:10
 */
public interface UserService {
    /**
     * 根据用户id返回收货地址
     * @param userId
     * @return
     */
    List<UserAddress> getAddressList(String userId);
}
