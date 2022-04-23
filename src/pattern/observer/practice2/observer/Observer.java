package pattern.observer.practice2.observer;

import pattern.observer.practice2.subject.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void notify(Subject subject, Object arg);
}
