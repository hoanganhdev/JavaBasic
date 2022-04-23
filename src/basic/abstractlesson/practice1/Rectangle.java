package basic.abstractlesson.practice1;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Draw " + super.getColor() + " rectangle");
    }

    // Kiểm tra có phải là hình vuông hay ko
    public void isSquare() {
        System.out.println("This is square");
    }
}
