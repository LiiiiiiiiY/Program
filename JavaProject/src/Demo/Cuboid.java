package Demo;

public class Cuboid extends Rectangle {
    private   double height;

    Cuboid(double length, double width, double height){
        super(length,width);
        this.height=height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double findArea(){
        return super.getWidth()*super.getLength();
    }

    public double findVolume(){
        return super.getWidth()*super.getLength()*height;
    }

    public String toString(){
        return "length:"+super.getLength()+" width:"+super.getWidth()+" height:"+height;
    }
}
