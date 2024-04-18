public class Dog {
    private String name;
    private String sex;
    private String color;
    private int age;

    public void setInfo(String name,String sex,String color,int age){
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.age = age;
    }

    public void dogInfo(){
        System.out.printf("The dog's name is %s, sex is %s, " +
                "color is %s, and age is %d.\n",this.name,this.sex,this.color,this.age
        );
    }

    public void eating(String food){
        System.out.printf("%s is eating the %s\n",this.name,food);
    }
}
