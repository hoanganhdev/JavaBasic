package pattern.observer.practice1.observer.concrete;

import pattern.observer.practice1.models.User;
import pattern.observer.practice1.observer.Observer;

public class Logger implements Observer {
    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}
