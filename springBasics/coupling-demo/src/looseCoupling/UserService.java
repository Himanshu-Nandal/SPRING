package looseCoupling;

public class UserService {
    NotificationService notificationService;

    // Constructor Injection:
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
        notificationService.send("Notification hello from loose coupling!");
    }

}

/* Coupling is dependency of a class/code on another - tight coupling/loose coupling
* looseCoupling.UserService is loosely coupled with looseCoupling.NotificationService since the functioning of the former only declares an obj reference for the later n later instantiates it, and will not be effected if any logic is changed (eg new class introduced, etc.) in the later */
