// this vs. super

public class People1 {
    String name;
    int age;
    char sex;

    People1(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }

    void printInfo() {
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
        System.out.println("Sex " + this.sex);
    }

    void eat() {
        System.out.println(this.name + " is Eating");
    }

    void sleep() {
        System.out.println(this.name + " is Sleeping");
    }
}
