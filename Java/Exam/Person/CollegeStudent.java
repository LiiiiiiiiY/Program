package Java.Exam.Person;

public class CollegeStudent extends Person{
    private int scholarship;
    
    CollegeStudent(int scholarship){
        this.scholarship = scholarship;
    }

    public void pay(){
        System.out.println(scholarship);
    }
}
