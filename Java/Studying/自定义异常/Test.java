package Java.Studying.自定义异常;

public class Test {
    public static void main(String[] args) {
        Circle e = new Circle();
        try{
            e.setRadius(-2);
        }catch(CircleException ex){
            System.out.println("Custom exception:" + ex.toString());
        }
        e.show();
    }
}
