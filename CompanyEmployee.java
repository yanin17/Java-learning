// Edit method that is inher from super class
public class CompanyEmployee {
    protected String name = new String("Somsak");
    protected double salary;

    public CompanyEmployee() {
        salary = 30000.00;
    }

    public String getinformation() {
        return "Name: " + name + "\n" + "Salary: " + salary + "\n";
    }
}
