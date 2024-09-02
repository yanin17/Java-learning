public class TestInherit {
    public static void main(String[] args) {
        System.out.println("------ Student ------");
        Student n = new Student("Maleewan", 20, 'F', 2.00f);
        n.printInfo();
        n.study();

        System.out.println("------ Lecturer ------");
        Lecturer l = new Lecturer("Boonchoo", 25, 'M');
        l.printInfo();
        l.Lecture();

        System.out.println("------ Employee ------");
        Employee e = new Employee("Amorn", 32, 'F');
        e.printInfo();
        e.work();

        System.out.println();
    }
}
