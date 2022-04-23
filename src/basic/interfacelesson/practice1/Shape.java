package basic.interfacelesson.practice1;

public interface Shape {
    /*Mặc định là static final*/
    String color = "red";
    static String accc = "4234"; // Theo static ở đây là dư thừa (redundant)

    /*Mặc định là public modifier cho method*/
    void draw();

    /*Ở phiên bản java 8 thì có thêm default và static methods*/
    /*E.g
    default void defaultMethod() {
        // default method implementation
    }
    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
    */

    /*Ở phiên bản java 9 thì có thể thêm private method
    * private static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }*/
}
