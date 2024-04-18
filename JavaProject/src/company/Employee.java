package company;

public class Employee {
    private String name;
    private int birth;

    Employee(String name,int birth){
        this.name = name;
        this.birth = birth;
    }
    double getSalary(int month){
        if(month == birth)return 100;
        else return 0;
    }

    String getName(){
        return name;
    }
}
