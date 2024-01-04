package Java.Exam.Person;

public class Test {
    public static void main(String[] args) {
        Person persons[]=new Person[2];
        persons[0] = new Teacher(4000, 40);
        persons[1] = new CollegeStudent(1200);
        persons[0].pay();
        persons[1].pay();
    }
}
