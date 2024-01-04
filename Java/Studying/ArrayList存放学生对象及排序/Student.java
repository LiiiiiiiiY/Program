package Java.Studying.ArrayList存放学生对象及排序;

public class Student {
    private String name;
    private int id;
    private int age;
    private String major;
    Student(String name, int id, int age, String major){
        this.name = name;
        this.id = id;
        this.age = age;
        this.major = major;
    }

    public int getAge(){
        return age;
    }
    public String toString(){
        return "Student [Name: " + name + ", ID: " + id + ", Age: " + age + ", Major: " + major +"]";
    }
}
