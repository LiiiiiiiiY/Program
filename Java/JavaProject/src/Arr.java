import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int out_sum = 0, Num = num;
        System.out.printf("%d,",Num);
        while (Num != 0){
            int bit = Num % 10;
            if (Num < 10)System.out.printf("%d!=",bit);
            else System.out.printf("%d!+",bit);
            int sum = 1, j = 1;
            while (j <= bit)sum *= j++;
            out_sum+=sum;
            Num/=10;
        }
        System.out.printf("%d\n",out_sum);
        if(out_sum == num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
