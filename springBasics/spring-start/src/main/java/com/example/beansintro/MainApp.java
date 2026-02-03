package com.example.beansintro;

import com.example.looseCoupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBean.xml");
        GreetingService greetingService = (GreetingService) context.getBean("myBean");
        greetingService.sayHello();

        UserService userService = (UserService) context.getBean("UserService");
        userService.notifyUser("UserService bean created! ");
    }
}
