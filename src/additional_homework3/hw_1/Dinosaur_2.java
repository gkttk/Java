package additional_homework3.hw_1;
import java.util.Scanner;

public class Dinosaur_2 {
    public static void main(String[] args) {
        double mass;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите массу динозавра(в килограммах): ");
        mass = reader.nextDouble();
        System.out.printf("\nДинозавр весит %.3f грамм, или\nДинозавр весит %.3f миллиграмм, или\n" +
                        "Динозавр весит %.3f тонны", (mass*1000),(mass*1e+6),(mass/1000));

    }
}
