package com.wisdomguo.livestar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
@Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
    RedisTemplate<String,Object> r=new RedisTemplate<>();
    RedisSerializer sr=new StringRedisSerializer();
    r.setValueSerializer(sr);
    r.setKeySerializer(sr);
    r.setConnectionFactory(factory);
    return  r;
    }
}
