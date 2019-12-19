package additional_homework3.hw_2;
import java.util.Scanner;

public class Divisors_2_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        System.out.println("Введите натуральное число:");
        num = reader.nextInt();
        allDivisors(num);

    }

    public static void allDivisors(int number){
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }

}
