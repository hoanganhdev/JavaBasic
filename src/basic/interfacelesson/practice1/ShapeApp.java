package basic.interfacelesson.practice1;

/* Phần này sẽ nói về interface class và những điều cần chú ý
  Lưu ý:
   . Thể hiện tính trừu tượng 100% (Java < 8).
   . Phiên bản Java < 8, Interface chỉ có thể có phương thức abstract.
   . Phiên bản Java 8, có thể thêm default và static methods.
   . Phiên bản Java 9, có thể thêm private methods.
   . Interface hỗ trợ đa kế thừa
   . Interface chỉ có các biến static final
   . Interface không thể có phương thức static, main hoặc constructor.
  Dùng khi nào?
   . Dựng một bộ khung chuẩn gồm các chức năng mà các module cần phải có. Các module phải implement đầy đủ các chức năng đã được đinh nghĩa
   . Hay cách nói khác là một chức năng mà có hữu ích cho nhiều đối tượng khác nhau thì nên dùng Interface
   . Thể hiện mối quan hệ has-a (Có, hay thực hiện)
     E.g:
     // Programmer là Person, thực hiện việc Programming, Debugging
        class Programmer extends Person implements Programming, Debugging {}
* */
public class ShapeApp {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.draw();
        //rect.isSquare(); => Only public methods that are defined in Interface are accessible. Methods defined in Implement are not.
        System.out.println("---");
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw();
//        rectangle.isSquare();
        System.out.println("---");
        Shape circle = new Circle();
        circle.draw();
    }
}
