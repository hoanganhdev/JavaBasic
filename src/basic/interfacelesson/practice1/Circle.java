package basic.interfacelesson.practice1;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw " + color + " circle");
    }
}
