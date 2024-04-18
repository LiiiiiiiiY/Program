/*
 * 请从键盘随机输入10个整数，保存在list中，
 * 并按照倒序、从大到小的顺序显示出来
 */
package exercise;
import java.util.*;
public class sort{
    public static void main(String[] args){
        System.out.println("请输入十个数，以空格分隔：");
        Scanner scanner = new Scanner(System.in);
        String[] strArray = scanner.nextLine().split(" ");
        //String str = "23 27 95 20 4 58 103 385 839 37 18 38";
        scanner.close();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < strArray.length; i++){
            list.add(Integer.parseInt(strArray[i]));
        }
        Collections.reverse(list);
        for(int integer:list){
            System.out.print(integer + " ");
        }
        System.out.println();
        Collections.sort(list);
        Collections.reverse(list);
        for(int integer:list){
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}