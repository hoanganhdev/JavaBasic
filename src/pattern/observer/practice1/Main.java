package pattern.observer.practice1;

/*
* Ứng dụng observer pattern để tracking thao tác cảu một account. Thực hiện thông báo qua Mailer, Logger, Protector
* */

import pattern.observer.practice1.enums.LoginStatus;
import pattern.observer.practice1.observer.concrete.Logger;
import pattern.observer.practice1.observer.concrete.Mailer;
import pattern.observer.practice1.observer.concrete.Protector;
import pattern.observer.practice1.subject.concrete.AccountService;

/*Lưu ý:
    Observer Pattern là một trong những Pattern thuộc nhóm hành vi (Behavior Pattern).
    Nó định nghĩa mối phụ thuộc một – nhiều giữa các đối tượng để khi mà một đối tượng có sự thay đổi trạng thái,
    tất các thành phần phụ thuộc của nó sẽ được thông báo và cập nhật một cách tự động.
  Thành phần:
    Subject: Chứa danh sách các observer, cung cấp các phương thức để thêm/bỏ các observer
    ConcreteSubject: cài đặt các phương thức của Subject, lưu trữ trạng thái danh sách các ConcreateObserver, gửi thông báo đến các observer của nó khi có sự thay đổi trạng thái.
    Observer: định nghĩa một phương thức update/notify cho các đối tượng mà subject sẽ thông báo khi có thay đổi trạng thái
    ConcreteObserver: cài đặt các phương thức của Observer, lưu trữ trạng thái của subject, thực thi việc cập nhật để giữ cho trạng thái đồng nhất với subject gửi thông báo đến.
* */
public class Main {
    public static void main(String[] args) {
        AccountService account1 = createAccount("contact@gpcoder.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("---");
        AccountService account2 = createAccount("contact@gpcoder.com", "116.108.77.231");
        account2.login();
    }

    private static AccountService createAccount(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }
}
