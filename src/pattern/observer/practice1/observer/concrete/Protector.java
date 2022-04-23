package pattern.observer.practice1.observer.concrete;

import pattern.observer.practice1.enums.LoginStatus;
import pattern.observer.practice1.models.User;
import pattern.observer.practice1.observer.Observer;

public class Protector implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.INVALID) {
            System.out.println("Protector: User " + user.getEmail() + " is invalid. "
                    + "IP " + user.getIp() + " is blocked");
        }
    }
}
