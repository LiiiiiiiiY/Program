package firm;
import java.util.HashMap;

public class MainTest {
    public static void main(String[] args){
        HashMap<String,Integer> firm = new HashMap<>();
        firm.put("小米", 12345);
        firm.put("华为", 67890);
        firm.put("Apple", 13579);
        DeleteFirm(firm,"荣耀");
        DeleteFirm(firm,"Apple");
        FindFirm(firm, "小米");
    }
    private static void DeleteFirm(HashMap<String, Integer> firm, String firmName) {
        if (firm.containsKey(firmName)) {
            firm.remove(firmName);
            System.out.println("成功删除" + firmName +"公司");
        } else {
            System.out.println("找不到" + firmName + "公司");
        }
        System.out.println();
    }

     private static void FindFirm(HashMap<String, Integer> firm, String firmName) {
        if (firm.containsKey(firmName)) {
            System.out.println(firmName + "公司的电话号码是：" + firm.get(firmName));
        } else {
            System.out.println("找不到" + firmName + "公司");
        }
        System.out.println();
    }
}
