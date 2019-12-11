
package homework1.name_3;
import java.util.Objects;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        System.out.print("Введите ваше имя: ");
        name = reader.nextLine();
       Check.iF(name);
        System.out.println("\nМетод iF отработал\n---------------------");
       Check.ifElse(name);
        System.out.println("\nМетод ifElse отработал\n---------------------");
       Check.switCH(name);
        System.out.println("\nМетод switCH отработал\n---------------------");

    }
}

