// this vs. super

public class Student extends People1 {
    float gpa = 0.0f;

    Student(String name, int age, char sex, float gpa) {
        super(name, age, sex);
        this.gpa = gpa;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("GPA: " + this.gpa);
    }

    void study() {
        System.out.println(this.name + " is Studying");
    }
}
