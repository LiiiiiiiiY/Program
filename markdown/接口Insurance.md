## 接口`Insurance`

```java
import java.util.Date;

public interface Insurance {
    int getPolicyNumber();//保险号码
    int getCoverageAmount();//保险金额
    double calculatePremium();//计算费用
    Date getExpiryDate();//终止日期
}
```

## 实现接口方法`Insurance`

```java
import java.time.*;
import java.util.Date;

public class Car implements Insurance {
    private int PolicyNumber;
    private int CoverageAmount;
    private LocalDate ExpiryDate;

    Car(int PolicyNumber, int CoverageAmount, LocalDate ExpiryDate){
        this.PolicyNumber = PolicyNumber;
        this.CoverageAmount = CoverageAmount;
        this.ExpiryDate = ExpiryDate;
    }

    public int getPolicyNumber() {//保险号码
        return PolicyNumber;
    }
    public int getCoverageAmount() {//保险金额
        return CoverageAmount;
    }

    public double calculatePremium(){//计算费用
        // 获取当前日期
        LocalDate currentDate = LocalDate.now();
        // 计算年份差值
        Period period = Period.between(currentDate,ExpiryDate);
        int yearDifference = period.getYears();
        //计算费用 = 年份差值 * 保单金额
        return yearDifference * CoverageAmount;
    }

    public Date getExpiryDate(){//终止日期
        //将LocalDate类型的时间转为Date类型
        Date ExpirytoDate = Date.from(ExpiryDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return ExpirytoDate;
    }
}
```

## 测试类`MainTest`

```java
import java.text.*;
import java.time.LocalDate;
import java.util.*;

public class MainTest {
    public static void main(String[] args) throws ParseException {
        //获取输入时间
        System.out.print("请输入终止日期（格式：yyyy-MM-dd）: ");
        Scanner scanner = new Scanner(System.in);
        String inputDateStr = scanner.nextLine();
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

```

