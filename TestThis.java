// Overloading Constructor
public class TestThis {
    private String name = "Ratchanon";

    public TestThis(String name) {
        name = name;
        // this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        TestThis t = new TestThis("Pattiwat");
        t.print();
    }
}
