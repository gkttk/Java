package additional_homework3.hw_1;
import java.util.Scanner;

public class Comparison_1_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double a, b, c;
        System.out.print("Введите a: ");
        a = reader.nextDouble();
        System.out.println();
        System.out.print("Введите b: ");
        b = reader.nextDouble();
        System.out.println();
        System.out.print("Введите c: ");
        c = reader.nextDouble();
        System.out.println();

        if(a == b && b == c){
            System.out.println("Числа одинаковы");
        }
        else{
            System.out.println("Числа различны");
        }
    }
}
