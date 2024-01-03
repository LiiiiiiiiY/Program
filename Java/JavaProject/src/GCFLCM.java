import java.util.Scanner;

public class GCFLCM {
    public static long GetGCF(long number1, long number2) {
        long sum;
        while (number2 != 0) {
            sum = number1 % number2;
            number1 = number2;
            number2 = sum;
        }
        return number1;
    }

    public static void main(String[] args) {
        System.out.print("请输入两个值：");
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long GCF = GetGCF(num1, num2);
        long LCM = (num1 * num2) / GCF;
        System.out.printf("这两个值的最大公约数为%d，最小公倍数为%d", GCF, LCM);
    }
}
