package OOP.4_abstract_interface;

public class Sqare extends Shape {
    protected double side;

    public Sqare(double d) {
        side = d;
    }

    public double calArea() {
        return side * side;
    };
}
