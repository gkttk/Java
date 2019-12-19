package additional_homework3.hw_2;

import java.util.Scanner;

public class Max_2_1 {
    public static void main(String[] args) {
       String digit;
        int max = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        digit = reader.nextLine();
        if(maximum(digit) != 0) {
            System.out.println("Максимальная цифра введенного натурального числа - " + maximum(digit));
        }
    }

    public static int maximum(String number){
        int max = 0;
        if(number.length() == 0){
            System.out.println("Вы не ввели число");
            return 0;
        }

        for(int i = 0; i < number.length(); i++){
           if((number.charAt(i) - '0') > max){
               max = number.charAt(i) - '0';
           }
        }
        return max;
    }
}
