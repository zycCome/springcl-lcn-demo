package com.lcn.client_two.controller;

import com.lcn.client_two.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserTwoController
 *
 * @author heng
 * @date 2019/9/7
 **/
@RestController
@RequestMapping("userTwo")
public class UserTwoController {
    @Autowired
    private UserService userService;
   // @LcnTransaction
    @RequestMapping("/insertUser")
    public Integer insertUser(@RequestParam(value = "a" ,defaultValue = "1") int a) {
        return   userService.saveUser(a);
    }
}
