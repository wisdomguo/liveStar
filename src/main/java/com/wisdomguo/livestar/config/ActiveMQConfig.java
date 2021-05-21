package com.wisdomguo.livestar.config;

import com.wisdomguo.livestar.utils.CommonUtil;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Topic;

@Configuration
public class ActiveMQConfig {
    @Bean
    public Topic topic(){
        return  new ActiveMQTopic(CommonUtil.COM);
    }
}
