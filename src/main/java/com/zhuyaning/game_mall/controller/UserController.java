package com.zhuyaning.game_mall.controller;

import com.zhuyaning.game_mall.model.ApiModel;
import com.zhuyaning.game_mall.pojo.User;
import com.zhuyaning.game_mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2022/02/23
 *   Time: 20:05
 */

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userInfo")
    ApiModel<User> getUserInfo(@RequestParam(value = "uid") Long uid) {
        User user = userService.getUser(uid);
        return new ApiModel<>(user);
    }
}
