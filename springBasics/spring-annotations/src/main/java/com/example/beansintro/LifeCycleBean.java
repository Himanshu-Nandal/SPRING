package com.example.beansintro;

import com.example.looseCoupling.NotificationService;
import org.springframework.stereotype.Component;

//@Component
public class LifeCycleBean {
    private NotificationService notificationService;

    public LifeCycleBean(NotificationService notificationService) {
        System.out.println("constructor called: dependency injected ");
        this.notificationService = notificationService;
    }

    public void init(){
        System.out.println("init called: Bean initialized");
        notificationService.send("Hello from init() ");
    }

    public void performTask(){
        System.out.println("Ready for use!: performTask() called ");
    }

    public void cleanup(){
        System.out.println("cleanup() is being called");
    }
}
