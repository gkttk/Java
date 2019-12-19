package additional_homework3.hw_2;

import java.util.Scanner;

public class Amicable_Numbers_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min, max;
       System.out.println("Диапазон чисел от");
        min = reader.nextInt();
        System.out.println("до");
        max = reader.nextInt();
        amicable(min , max);


    }

    public static void amicable(int min, int max) {
        int sum1 = 0;
        int sum2 = 0;
        int ch2 = 0;

        for (int i = min; i <= max; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum1 += j;
                }//if
            }//for
            if (min <= sum1 && sum1 <= max && sum1 > i) {
                ch2 = sum1;
                for (int k = 1; k < ch2; k++) {
                    if (ch2 % k == 0) {
                        sum2 += k;
                    }//if
                }//for
                if (sum2 == i) {
                    System.out.println("Числа " + i + " " + ch2 + " дружественные");
                }

            }//if
            sum1 = 0;
            sum2 = 0;
        }//for

    }//amicable
}