package com.example.looseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("UserService")
public class UserService {
    NotificationService notificationService; // this field directly can be autowired but that practice is not recommended in practice

    // Constructor Injection:
    @Autowired // we don't need to write the autowired annotation Since it have just a single constructor in the class, else it is needed
    public UserService(@Qualifier("emailNotificationService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
        notificationService.send("Notification hello from spring annotation!: " +message);
    }

}

// @Qualifier("emailNotificationService") needed since autowiring auto assigns notificationService to one of its implementation but
// since there are multiple implementations of NotificationService in the Context, hence it is necessary to mention which one qualifies by passing the name of that component/bean
// @Primary can be assigned over the wanted class instead of putting @Qualifier at the place of dependency injection
// @Qualifier > @Primary in hierarchy
/* General Annotations:
* Service
* Repository
* Controller
* RestController */
