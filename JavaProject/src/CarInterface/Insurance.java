package CarInterface;

import java.util.Date;

public interface Insurance {
    int getPolicyNumber();//保险号码
    int getCoverageAmount();//保险金额
    double calculatePremium();//计算费用
    Date getExpiryDate();//终止日期
}
