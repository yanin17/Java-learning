package OOP.4_abstract_interface;

public class Circle extends Shape {
    protected double radius;

    public Circle(double r) {
        radius = r;
    }

    public double calArea() {
        return Math.PI * radius * radius;
    };
}
