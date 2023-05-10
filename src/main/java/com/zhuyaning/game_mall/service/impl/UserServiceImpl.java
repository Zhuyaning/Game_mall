package com.zhuyaning.game_mall.service.impl;

import com.zhuyaning.game_mall.pojo.User;
import com.zhuyaning.game_mall.repository.UserRepository;
import com.zhuyaning.game_mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Long uid) {
        return userRepository.findById(uid).orElse(null);
    }
}
