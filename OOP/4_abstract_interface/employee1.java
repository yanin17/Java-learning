package OOP.4_abstract_interface;

abstract class employee1 {
    protected String emp_id;

    public abstract void setOT(double amount);

    public double calOT(int mhr, double pr) {
        return mhr * pr;
    }

    public void setID(String ID) {
        emp_id = ID;
    }
}
