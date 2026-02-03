package tightCoupling;

public class UserService {
    NotificationServices notificationServices = new NotificationServices();
    public void notifyUser(String message){
        notificationServices.send("notification hello!");
    }
}

/* Coupling is dependency of a class/code on another - tight coupling/loose coupling
* tightCoupling.UserService is tightly coupled with tightCoupling.NotificationServices since the functioning of the former creates n uses the obj of the latter and will be effected if any logic is changed (eg new class introduced, etc.) in the later */
