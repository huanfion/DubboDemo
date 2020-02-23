package com.zegobird.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/16 11:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserAddress implements Serializable {

    private Integer id;
    private String userAddress;//用户地址
    private String userId;
    private String consignee;//收货人
    private String phoneNum;//电话号码
    private String isDefault;//是否为默认地址

}
