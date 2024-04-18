package company;

public class SalariedEmployee extends Employee{
    private double salary;
    SalariedEmployee(String name,int birth,int salary){
        super(name,birth);
        this.salary = salary;
    }

    public double getSalary(int month) {
        return super.getSalary(month) + salary;
    }
}
