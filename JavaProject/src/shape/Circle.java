package shape;

public class Circle extends Shape{
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }
    public double getLength(){
        return 2*PI*radius;
    }
}
