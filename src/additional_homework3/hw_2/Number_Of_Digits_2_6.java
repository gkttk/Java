package additional_homework3.hw_2;

import java.util.Scanner;

public class Number_Of_Digits_2_6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       String num;
        System.out.println("Введите число:");
        num = reader.nextLine();
        System.out.printf("Количество различных цифр у заданного числа - %d", digits(num));
    }


    public static int digits(String number) {
        int amount = 0;

        for (int j = 0; j < 10; j++) {
        for (int i = 0; i < number.length(); i++) {
            if (j == (number.charAt(i) - '0')) {
                amount++;
                break;
            }
        }//for
    }
        return amount;
    }

}

