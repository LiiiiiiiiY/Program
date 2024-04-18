class Circle{
    private double radius;
    final double PAI = 3.14;
    Circle(){
        this.radius = 1;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double findArea(){
        return PAI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    private double length;

    Cylinder(){
        length=1;
    }

    void setLength(double length){
        this.length = length;
    }

    double getLength(){
        return this.length;
    }

    @Override
    public double findArea() {
        return 2*super.findArea()+2*super.PAI*getLength()*this.length;
    }
}
public class TestCylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(1);
        cylinder.setLength(1);
        double surface_area = cylinder.findArea();
        System.out.println("Cylinder surface area:"+surface_area);
        double volume = cylinder.PAI * cylinder.getRadius() *cylinder.getRadius()*cylinder.getLength();
        System.out.println("Cylinder volume:"+volume);
    }
}