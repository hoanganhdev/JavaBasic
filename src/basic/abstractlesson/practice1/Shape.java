package basic.abstractlesson.practice1;

public abstract class Shape {
    /* Define private fields
     * => Các fields thì có thể là final, non-final, static và non-static
     * => Các fields thì có thể được khởi tạo hoặc không*/
    private final static String color = "red";

    /* Có thể có hàm Contractor ở trong abstract class*/
    public Shape() {

    }

    /*Có thể có abstract/non-abstract method
    * Có thể define method body*/
    public abstract void draw();

    public String getColor() {
        return color;
    }
}
