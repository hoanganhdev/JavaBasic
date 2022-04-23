package pattern.observer.practice1.observer.concrete;

import pattern.observer.practice1.enums.LoginStatus;
import pattern.observer.practice1.models.User;
import pattern.observer.practice1.observer.Observer;

public class Mailer implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}
