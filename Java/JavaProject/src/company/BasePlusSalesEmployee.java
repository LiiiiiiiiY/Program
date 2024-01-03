package company;

public class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;
    BasePlusSalesEmployee(String name,int birth,double sales,double pre,double baseSalary){
        super(name,birth,sales,pre);
        this.baseSalary = baseSalary;
    }

    public double getSalary(int month) {
        return super.getSalary(month) + baseSalary;
    }
}
