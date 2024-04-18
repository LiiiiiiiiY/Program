package Employee;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void work();

    String getName(){
        return name;
    }

    int getId(){
        return id;
    }

    double getSalary(){
        return salary;
    }
}
