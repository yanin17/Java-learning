//public class TestFinal extends TestFinal1 {
public class TestFinal extends TestFinal2 {

    /*
     * public void print() {
     * System.out.println("Test Final: print(): Non-static class");
     * System.out.println("Test Final: print(): Non-static method");
     * System.out.println("Test Final: print(): TestFinal");
     * }
     * 
     * public final void printStatic() {
     * System.out.println("Test Final: print(): Non-static class");
     * System.out.println("Test Final: print(): Static method");
     * System.out.println("Test Final: print(): TestFinal");
     * }
     */
    public static void main(String[] args) {
        TestFinal tfc = new TestFinal();
        tfc.print();
        tfc.printStatic();
    }
}
