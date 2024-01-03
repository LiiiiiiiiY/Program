public class 阶乘累加 {
    public static void main(String[] args) {
        long sum = 0, factorial = 1;
        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            sum += factorial;
        }
        System.out.println("sum=" + sum);
    }
}