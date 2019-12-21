package additional_homework3.hw_2;
import java.util.Scanner;
public class Palindrome_2_2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        System.out.println("Введите число:");
        num = reader.nextInt();
        palindrome(num);

    }

    public static void palindrome(int number) {
        int length = 0;
        int len = number;
        do {
            len /= 10;
            length++;
        } while (len > 9);
        if (length == 1) {
            System.out.println("Число является палиндромом");
            return;
        }
        for (int i = 0; i <= length; i++) {
            if ((number / (int) (Math.pow(10, length - i)) % 10) != number / (int) (Math.pow(10, i)) % 10) {
                System.out.println("Число не является палиндромом");
                return;
            }
        }
        System.out.println("Число является палиндромом");

    }
}

    /*public static void palindrome(String number){
        if(number.length() == 0){
            System.out.println("Вы ничего не ввели");
            return;
        }
        for(int i = 0; i < number.length()/2; i++){
            if((number.charAt(i)-'0') != (number.charAt(number.length()-1-i)-'0')){
                System.out.println("Число не является палиндромом");
                return;
            }
            else{
                continue;
            }
        }
        System.out.println("Число является палиндромом");
    }*/   //решение через строки

