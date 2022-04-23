package pattern.observer.practice2;

import pattern.observer.practice1.enums.LoginStatus;
import pattern.observer.practice2.observer.Observer;
import pattern.observer.practice2.observer.concrete.Logger;
import pattern.observer.practice2.subject.concrete.AccountData;

public class Main {
    public static void main(String[] args) {
        AccountData account1 = new AccountData("contact@gpcoder.com", "127.0.0.1");
        Observer logger = new Logger(account1);
        account1.changeStatus(LoginStatus.EXPIRED);

    }
}
