package Java.Exam.Shape;

public class Rectangle extends Shape {
    private double height;
    private double width;

    Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return height*width;
    }
    
    public double getLength(){
        return (height+width)*2;
    }
}
