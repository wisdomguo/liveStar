package com.wisdomguo.livestar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@EnableScheduling
@ComponentScan(basePackages={"com.wisdomguo"})
@SpringBootApplication
@MapperScan("com.wisdomguo.**.dao")
public class LivestarApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivestarApplication.class, args);
    }

    @Bean
    public TaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler threadPoolTaskScheduler=new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(10);
        threadPoolTaskScheduler.setThreadNamePrefix("springboot-task");
        return threadPoolTaskScheduler;
    }
}
