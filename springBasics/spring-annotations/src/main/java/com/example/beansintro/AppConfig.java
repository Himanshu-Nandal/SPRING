package com.example.beansintro;

import com.example.looseCoupling.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup") // also a way to make beans // here this method returns a Bean
    public LifeCycleBean lifeCycleBean(NotificationService notificationService){
        return new LifeCycleBean(notificationService);
    }

}
