import java.util.Scanner;
import java.util.Random;
public class 猜数字 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        int number = rd.nextInt(100)+1;
        boolean result = true;
        System.out.print("猜数字游戏开始，请输入数字：");
        while(result)
        {
            int inputNumber=input.nextInt();
            if(inputNumber==number){
                System.out.println("恭喜你，猜对了");
                result = false;
            }
            else if(inputNumber>number)
                System.out.print("你输入的数字比随机数大，请再猜：");
            else if(inputNumber<number)
                System.out.print("你输入的数字比随机数小，请再猜：");

        }
    }
}
