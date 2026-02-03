package com.example.beansintro;

import org.springframework.stereotype.Component;

@Component("myBean") // Marks a class as a spring managed component (bean)
public class GreetingService {
    public void sayHello() {
        System.out.println("Hello from 1st spring project! ");
    }
}
