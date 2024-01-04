package Java.Studying.自定义异常;

public class Circle {
    private double radius;

    public void setRadius(double r)throws CircleException{
        if( r < 0 ){
            throw new CircleException(r,"Custom exception:");
        }
        else{
            this.radius = r;
        }
    }
    
    public void show(){
        System.out.println("area=" + radius);
    }
    
}
