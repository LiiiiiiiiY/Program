package Java.Exam.整数求和;

import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(a);
        System.out.println(n);
        scanner.close();
        int sum = a;
        int b = a;
        for(int i=1;i<n;i++){
            a = b * (int)Math.pow(10,i) + a;
            sum += a;
        }
        System.out.println(sum);
    }
}
