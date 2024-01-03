package company;

public class SalesEmployee extends Employee{
    private double sales;
    private double pre;

    SalesEmployee(String name,int birth,double sales,double pre){
        super(name,birth);
        this.sales = sales;
        this.pre = pre;
    }

    public double getSalary(int month) {
        return super.getSalary(month) + sales * pre;
    }
}
