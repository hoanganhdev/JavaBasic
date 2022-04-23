package pattern.observer.practice2.observer.concrete;

import pattern.observer.practice2.observer.Observer;
import pattern.observer.practice2.subject.Subject;
import pattern.observer.practice2.subject.concrete.AccountData;

public class Logger extends Observer {

    public Logger(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void notify(Subject subject, Object arg) {
        if (subject instanceof AccountData) {
            System.out.println("Logger: " + ((AccountData) subject).getUser().getStatus());
        }
    }
}
