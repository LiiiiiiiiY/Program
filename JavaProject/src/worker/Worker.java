package worker;

public class Worker{
    private int age;
    private String name;
    private double salary;
    Worker(String name,int age,double salary){
        this.age  =age;
        this.name =name;
        this.salary =salary;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    double getSalary(){
        return salary;
    }
}
