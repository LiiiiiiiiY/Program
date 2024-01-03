package Employee;

class Manager extends Employee{
    private double bonus;

    Manager(String name,int id,double salary,double bonus){
        super(name,id,salary);
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println();
    }

    double getBonus(){
        return bonus;
    }
}

public class MainTest {
    public static void main(String[] args) {
        Manager manager = new Manager("张三",1,5000,25000);
        System.out.printf("%s的ID是%03d,他的基本工资是%.2f，他每年的奖金是%.2f",
                manager.getName(),manager.getId(),manager.getSalary(),manager.getBonus());
    }
}
