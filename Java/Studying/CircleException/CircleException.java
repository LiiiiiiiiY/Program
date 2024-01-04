package Java.Studying.CircleException;

public class CircleException extends Exception{
    private double radius;
    public CircleException(double radius, String message){
        super(message);
        this.radius = radius;
    }
    public String toString(){
        return "radius:"+radius+",needs to be a positive number.\n";
    }
}
