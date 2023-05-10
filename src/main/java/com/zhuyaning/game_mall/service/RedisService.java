package com.zhuyaning.game_mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2022/04/18
 *   Time: 23:58
 */
@Component
public class RedisService {

    StringRedisTemplate redisTemplate;

    @Autowired
    public RedisService(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 从redis取到对应的值。
     *
     * @param key key
     * @return key对应的值
     */
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 存一个键值对到redis数据库当中
     *
     * @param key   键
     * @param value 值
     */
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 存一个键值对到redis数据库当中，并且设置过期时间。
     *
     * @param key     键
     * @param value   值
     * @param expTime 过期时间
     */
    public void set(String key, String value, long expTime) {
        redisTemplate.opsForValue().set(key, value, expTime);
    }

}
