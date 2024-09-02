// Test Parent1 and Child1
public class TestParChil {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        System.out.println(p1.shadow);
        p1.overridden();

        Child1 c = new Child1();
        System.out.println(c.shadow);
        c.overridden();

        Parent1 p2 = new Parent1();
        System.out.println(p2.shadow);
        p2.overridden();
    }
}
