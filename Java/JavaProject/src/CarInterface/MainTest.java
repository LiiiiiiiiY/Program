package CarInterface;

import java.text.*;
import java.time.LocalDate;
import java.util.*;

public class MainTest {
    public static void main(String[] args) throws ParseException {
        //获取输入时间
        System.out.print("请输入终止日期（格式：yyyy-MM-dd）: ");
        Scanner scanner = new Scanner(System.in);
        String inputDateStr = scanner.nextLine();
        scanner.close();
        //将时间转为LocalDate类型
        LocalDate inputDate = LocalDate.parse(inputDateStr);
        //创建Car对象并初始化
        Car car = new Car(12345,2000,inputDate);
        //输出费用
        System.out.println(car.calculatePremium());
        //输出终止日期
        System.out.println(car.getExpiryDate());
    }
}
