package additional_homework3.hw_2;
import java.util.Scanner;
public class Palindrome_2_2 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String num;
        System.out.println("Введите число:");
        num = reader.nextLine();
        palindrome(num);
    }

    public static void palindrome(String number){
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
    }

}
