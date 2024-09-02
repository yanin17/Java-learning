// this vs. super

public class Employee extends People1 {
    Employee(String name, int age, char sex) {
        super(name, age, sex);
    }

    void work() {
        System.out.println(this.name + " is Working.");
    }
}
