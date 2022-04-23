package basic.interfacelesson.practice1;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw " + color + " rectangle");
    }

    /*=> Cách này không khiến nghị, vì Interface nên hướng theo API và không thay đổi theo thời gian
    * . Nếu đi theo hướng thiết kế các function nhỏ ngắn gọn thì đi theo interface
    * . Nếu đi theo hướng thiết kế các đơn vị chức năng lớn thì đi theo abstract class */
    // Kiểm tra có phải là hình vuông hay ko
    public void isSquare() {
        System.out.println("This is square");
    }
}
