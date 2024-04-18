package Demo;

public class MainTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0,4.0);
        System.out.printf("%s",rectangle.toString());
        System.out.println(" area:"+rectangle.findArea());
        Cuboid cuboid = new Cuboid(5.0,4.0,6.0);
        System.out.printf("%s",cuboid.toString());
        System.out.println(" area:"+cuboid.findArea()+" volume:"+cuboid.findVolume());
    }
}
