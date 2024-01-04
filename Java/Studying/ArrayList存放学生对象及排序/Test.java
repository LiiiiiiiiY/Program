package Java.Studying.ArrayList存放学生对象及排序;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhang",1401,20,"computer"));
        list.add(new Student("liu",1402,19,"law"));
        list.add(new Student("wang",1403,17,"mechanical"));

        for(Student s:list){
            System.out.println(s);
        }

        list.add(1,new Student("li",1402,16,"english"));
        for(Student s:list){
            System.out.println(s);
        }


        Collections.sort(list, Comparator.comparingInt(Student::getAge));
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
