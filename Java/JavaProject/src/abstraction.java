public class abstraction {
    public static void main(String[] args) {
        for (int i = 123; i < 987; i++) {
            for (int j = 123; j < 987; j++) {
                int sum = i +j;
                if(sum<987 && DeWeight(i,j,sum)){
                    System.out.printf("%d + %d = %d\n",i,j,sum);
                }
            }
        }
    }
    /*****************************************************************
     *将数字取余后的值作为数组索引

     *当数组对应索引下的值为0时，代表这个数字没有出现过
          ——>然后判断这个取余后的数字是否为0，因为数字范围在1-9之间，所以0是不允许存在的
               ——>返回false让if(sum<987 && both(i,j,sum))判断失效
          ——>当这个值既不为0，又没有出现过时，将这个数组索引对应的值置为1，代表出现过了，然后再找下一个数字
          ——>当所有数字都遍历一边时，代表当前没有重复数字，返回true给if(sum<987 && both(i,j,sum))做判断

     *当数组对应索引下的值为1时，代表这个数字已经出现过了，
          ——>返回false给if(sum<987 && both(i,j,sum))做判断
     ***************************************************************/
    static boolean DeWeight(int number1, int number2, int number3) {
        int[] digits = new int[10];
        while (number1 > 0) {
            int digit = number1 % 10;
            if (digits[digit] == 1 || digit == 0)return false;
            digits[digit] = 1;
            number1 /= 10;
        }

        while (number2 > 0) {
            int digit = number2 % 10;
            if (digits[digit] == 1 || digit==0)return false;
            digits[digit] = 1;
            number2 /= 10;
        }

        while (number3 > 0) {
            int digit = number3 % 10;
            if (digits[digit] == 1 || digit ==0)return false;
            digits[digit] = 1;
            number3 /= 10;
        }
        return true;
    }
}