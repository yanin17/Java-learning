// this vs. super

public class Lecturer extends People1 {
    Lecturer(String name, int age, char sex) {
        super(name, age, sex);
    }

    void Lecture() {
        System.out.println(this.name + " is Lecturing.");
    }
}
