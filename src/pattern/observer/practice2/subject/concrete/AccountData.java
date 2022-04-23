package pattern.observer.practice2.subject.concrete;

import pattern.observer.practice1.enums.LoginStatus;
import pattern.observer.practice1.models.User;
import pattern.observer.practice2.subject.Subject;

public class AccountData extends Subject {
    private User user;
    public AccountData(String email, String ip) {
        user = new User();
        user.setEmail(email);
        user.setIp(ip);
    }

    public User getUser() {
        return user;
    }

    public void changeStatus(LoginStatus status) {
        user.setStatus(status);
        System.out.println("Status is changed");
        this.notifyAllObserver(this, null);
    }
}
