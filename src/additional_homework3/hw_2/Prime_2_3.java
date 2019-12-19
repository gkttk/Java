package additional_homework3.hw_2;
import java.util.Scanner;

public class Prime_2_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        System.out.println("Введите натуральное число:");
        num = reader.nextInt();
        isPrime(num);
    }

    public static void isPrime(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Число простое");
        }
        else{
            System.out.println("Число не является простым");
        }
    }

}
