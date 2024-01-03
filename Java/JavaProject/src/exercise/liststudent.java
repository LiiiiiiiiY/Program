package exercise;
import java.util.*;
class Student implements Comparable<Student>{
    private String name;
    private int score,id;
    Student(String name,int score,int id){
        this.name=name;
        this.score=score;
        this.id=id;
    }
    public int compareTo(Student s){
        if(this.score > s.score)return -1;
        else if(this.score < s.score)return 1;
        return this.name.compareTo(s.name);
    }
    public void displayInfo(){
        System.out.println("Name: " + name + ", Score: " + score + ", ID: " + id);
    }
}

public class liststudent{
    public static void main(String[] args){
        TreeSet<Student> list=new TreeSet<>();
        list.add(new Student("甲",97,1));
        list.add(new Student("乙",65,2));
        list.add(new Student("丙",76,3));
        list.add(new Student("丁",84,4));
        list.add(new Student("戊",92,5));
        int count = 3;
        for(Student s:list){
            s.displayInfo();
            if(count-- == 0)break;
        }
    }
}