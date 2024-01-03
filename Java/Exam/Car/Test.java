package Java.Exam.Car;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("changan", 120000));
        carList.add(new Car("byd", 230000));
        carList.add(new Car("geely", 140000));

        Comparator<Car> price = Comparator.comparingInt(Car::getter).reversed();
        Collections.sort(carList,price);

        for(Car car:carList){
            System.out.println(car);
        }
    }
}
