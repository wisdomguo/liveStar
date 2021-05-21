package com.wisdomguo.livestar.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate redisTemplate;

    public boolean set(String key,String value,Integer time){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value);
        redisTemplate.expire(key, time,TimeUnit.SECONDS);
        return true;
    }

    public String get(String key){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        String val = (String) valueOperations.get(key);
        return val;
    }
}
