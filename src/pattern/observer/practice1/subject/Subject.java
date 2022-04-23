package pattern.observer.practice1.subject;
import pattern.observer.practice1.observer.Observer;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver();
}
