package company;

public class HourlyEmployee extends Employee{
    private double hourSalary;
    private int hour;

    HourlyEmployee(String name,int birth,double hourSalary,int hour){
        super(name,birth);
        this.hourSalary = hourSalary;
        this.hour = hour;
    }

    public double getSalary(int month) {
        double baseSalary = super.getSalary(month);
        double extraSalary = 0;
        if (hour > 160) {
            extraSalary = (hour - 160) * 1.5 * hourSalary;
        }
        return baseSalary + extraSalary;
    }
}
