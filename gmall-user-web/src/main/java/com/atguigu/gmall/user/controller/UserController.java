package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hypeng
 * @version 1.0
 * @packageName com.atguigu.gmall.user.controller
 * @className UserController
 * @Date 2018/8/1 - 8:55
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("userInfoList")
    public ResponseEntity<List<UserInfo>> userInfoList(HttpServletRequest request){
        List<UserInfo> userInfoList = userService.userInfoList();
        return ResponseEntity.ok(userInfoList);
    }

    @RequestMapping("getAddressListByUser")
    public ResponseEntity<List<UserAddress>> getAddressListByUser(String userId){
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return ResponseEntity.ok(userAddressList);
    }
}
