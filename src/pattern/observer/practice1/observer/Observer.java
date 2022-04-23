package pattern.observer.practice1.observer;
import pattern.observer.practice1.models.User;

public interface Observer {
    void update(User user);
}