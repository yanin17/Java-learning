package OOP.4_abstract_interface;

public class shape_main {
    public static void main(String[] args) {
        Circle Cir_shape = new Circle(10);
        Sqare Sq_shape = new Sqare(5);

        System.out.println("Circle");
        System.out.println("Area = " + Cir_shape.calArea());
        System.out.println(Cir_shape.getColor());
        System.out.println("\nSquare");
        System.out.println("Area = " + Sq_shape.calArea());
        System.out.println(Sq_shape.getColor());

    }

}
