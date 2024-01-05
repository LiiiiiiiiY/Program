package Java.Studying.HashMap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> m1 = new HashMap<>();
        m1.put("zhangsan",800);
        m1.put("lisi",1500);
        m1.put("wangwu",3000);
        m1.put("zhangsan",2600);
        for(Map.Entry<String, Integer> entry : m1.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue()+100;
            m1.put(key,value);
            System.out.println(key + "-" + value);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(m1.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // 打印排序后的结果
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
