package com.zhuyaning.game_mall;

import com.zhuyaning.game_mall.mapper.UserMapper;
import com.zhuyaning.game_mall.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GameMallApplicationTests {

    @Autowired
    UserMapper mapper;

    @Test
    void test1() {
        User user = mapper.selectById(123);
        System.out.println(user);
    }
}
