package additional_homework3.hw_1;
import java.util.Scanner;

public class Switch_a_b_7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b;
        System.out.println("Введите a:");
        a = reader.nextInt();
        System.out.println("Введите b:");
        b = reader.nextInt();

        System.out.printf("а = %d, b = %d", a,b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.printf("\nПосле изменений\nа = %d, b = %d", a,b);
    }
}
