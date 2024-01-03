package CarInterface;
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