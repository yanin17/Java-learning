public class ThaiManager extends CompanyEmployee {
    protected String department = "Dara Netwoek";

    // Decorate the method
    public String getinformation() {
        return "Name: " + name + "\n" + "Salary: " + salary + "\n" + "Department: " + department;
    }

    public static void main(String[] args) {
        CompanyEmployee emp = new CompanyEmployee();
        System.out.println("getInformation method from CompanyEmployee class: ");
        System.out.println(emp.getinformation());

        ThaiManager mgr = new ThaiManager();
        System.out.println("getInformation method from ThaiManager class: ");
        System.out.println(mgr.getinformation());

    }
}
