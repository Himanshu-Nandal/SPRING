package com.example.beansintro;

import com.example.looseCoupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Starting Spring Application Context ");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("retrieving lifecycle bean ");
        LifeCycleBean lifeCycleBean = context.getBean(LifeCycleBean.class);

        lifeCycleBean.performTask();

        System.out.println("closing spring context");
//        GreetingService greetingService = (GreetingService) context.getBean("myBean");
//        greetingService.sayHello();

        UserService userService = (UserService) context.getBean("UserService");
        userService.notifyUser("UserService Bean created! ");
    }
}
