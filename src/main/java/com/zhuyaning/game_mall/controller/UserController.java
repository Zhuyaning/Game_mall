package com.zhuyaning.game_mall.controller;

import com.zhuyaning.game_mall.model.ApiModel;
import com.zhuyaning.game_mall.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2022/02/23
 *   Time: 20:05
 */

@RestController
public class UserController {

    @GetMapping("/userInfo")
    ApiModel<User> getUserInfo() {
        User user = new User();
        return new ApiModel<>(user);
    }
}
