package Java.Exam.整数求和;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        System.out.print(a);
        int sum=a;
        int b = a;
        for(int i = 1; i < n; i++ ) {
            a = b * (int)Math.pow(10,i) + a;
            sum += a;
            System.out.print(" + "+ a);
        }
        System.out.println(" = "+sum);
    }
}
