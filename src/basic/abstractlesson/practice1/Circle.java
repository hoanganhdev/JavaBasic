package basic.abstractlesson.practice1;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Draw " + super.getColor() + " circle");
    }
}
