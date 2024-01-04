package Java.Exam.Person;

public class Teacher extends Person{
    private int salary;
    private int classes;
    
    Teacher(int salary, int classes){
        this.salary = salary;
        this.classes = classes;
    }

    public void pay(){
        System.out.println(salary + classes*50);
    }
}
