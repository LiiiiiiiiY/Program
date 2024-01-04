package Java.Exam.整数求和;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        System.out.print(a);
        int[] arr=new int[n];
        int sum=a;
        arr[0] = a;
        for(int i = 1; i < n; i++ ) {
            arr[i] = (int)Math.pow(10,i)*a + arr[i-1];
            sum += arr[i];
            System.out.print(" + "+arr[i]);
        }
        System.out.println(" = "+sum);
    }
}
