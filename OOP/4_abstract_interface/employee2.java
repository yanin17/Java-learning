package OOP.4_abstract_interface;
// We can declear abstract method with Abstract class
abstract class employee2 {
    protected String emp_id;

    public abstract void setOT(double amount);

    public void setID(String ID) {
        emp_id = ID;
    }

}
