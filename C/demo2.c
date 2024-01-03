#include <stdio.h>

int main() {
    int digit, sum;
    printf("玫瑰花数有：\n");
    for (int num = 1000; num <= 9999; num++) {
        sum = 0;
        int temp = num;
        while (temp > 0) {
            digit = temp % 10;
            sum += digit * digit * digit * digit;
            temp /= 10;
        }
        if (sum == num)printf("%d\n", num);
    }
    return 0;
}