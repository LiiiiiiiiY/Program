class Person{
    private String name;
    private int age;
    //private int gender;

    Person(String name){
        this.age = 18;
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Person tom = new Person("tom");
        Person jerry = new Person("jerry");
        System.out.printf("name:%s, age:%d\n",tom.getName(),tom.getAge());
        System.out.printf("name:%s, age:%d\n",jerry.getName(),jerry.getAge());
    }
}
