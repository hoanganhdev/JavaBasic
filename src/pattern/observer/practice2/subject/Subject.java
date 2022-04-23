package pattern.observer.practice2.subject;

import pattern.observer.practice2.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(Observer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public void notifyAllObserver(Subject subject, Object arg) {
        observers.forEach(observer -> {
            observer.notify(subject, arg);
        });
    }
}
