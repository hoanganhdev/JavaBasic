package basic.abstractlesson.practice1;

/* Phần này sẽ nói về abstract class và những điều cần chú ý
  Lưu ý:
   . Thể hiện tính trừu tượng < 100%
   . Lớp trừu tượng có thể có các phương thức abstract và non-abstract
   . Lớp trừu tượng có thể có các biến final, non-final, static và non-static
   . Lớp trừu tượng có thể có phương thức static, phương thức main và constructor
   . Từ khóa abstract được sử dụng để khai báo lớp trừu tượng
   . Lớp trừu tượng không hỗ trợ đa kế thừa
  Dùng khi nào?
   . Sử dụng trong concept kế thừa vì nó cung cấp một common base class implementation (triển khai lớp cơ sở chung) cho các lớp con (derived classes)
   . Khi ta muốn define non-public fields. (Interface thì default là public)
   . Nếu muốn add một method trong tương lai thì dùng abstract là best choise. (Interface thì bắt buộc các implement phải implement new method)
   . Khi ta muốn cung cấp một common method mà được define ở base class cho tất cả các lớp con thì nên dùng abstract. (Interface thì phải triển khai ở các implement class)
   . Thể hiện mối quan hệ is-a (là)
     E.g:
        // Rectangle là Shape, có Width, Height
        class Rectangle extends Shape implements Width, Height {}
* */
public class ShapeApp {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.draw();
        //rect.isSquare(); => Only public methods that are defined in SuperClass are accessible. Methods defined in SubClass are not.
        System.out.println("---");
        Rectangle subRect = new Rectangle();
        subRect.draw();
        subRect.isSquare();
        // => public methods defined in SubClass are also accessible along with the SuperClass pubic methods.
        System.out.println("---");
        Shape circle = new Circle();
        circle.draw();
    }
}
