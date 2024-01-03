package Java.Exam.Shape;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(10.5);
        System.out.println(s1.getArea());
        System.out.println(s1.getLength());
        Shape s2 = new Rectangle(6.5,10.3);
        System.out.println(s2.getArea());
        System.out.println(s2.getLength());
    }
    
}
