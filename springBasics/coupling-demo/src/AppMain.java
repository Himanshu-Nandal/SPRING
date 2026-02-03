import looseCoupling.EmailNotificationService;
import looseCoupling.NotificationService;
import tightCoupling.UserService;

public class AppMain {
    public static void main(String[] args) {
        // tight coupling
        UserService userService = new UserService();
        userService.notifyUser("Order Placed!");

        // loose coupling
        NotificationService emailNotificationService = new EmailNotificationService();
        // Constructor Injection
        looseCoupling.UserService userService1 = new looseCoupling.UserService(emailNotificationService);
        userService1.notifyUser("Order Processed");
    }
}


/* Dependency Injection:
* Constructor Injection - dependency is provided via constructor
* Setter Injection - dependency is provided via setter method
* Field Injection - dependency is assigned directly to a field (the field is marked public so it can be accessed anywhere and a dependency can be injected in it directly)
* */
