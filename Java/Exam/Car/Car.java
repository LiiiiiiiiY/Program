package Java.Exam.Car;


public class Car {
    private String brand;
    private int price;
    Car(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getter(){
        return "Brand="+brand+", Price= "+price;
    }

    public void setr(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public String toString(){
        return "Car ["+ getter() +"]";
    }
}
