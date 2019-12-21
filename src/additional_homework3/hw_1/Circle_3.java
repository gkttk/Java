package additional_homework3.hw_1;
import java.util.Scanner;
public class Circle_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double R1, R2, S;
        do{
            System.out.print("Введите радиус внешнего круга R1(радиус внешнего круга должен быть больше внутреннего): ");
            R1 = reader.nextDouble();
            System.out.print("\nВведите радиус внутреннего круга R2(радиус внешнего круга должен быть больше внутреннего): ");
            R2 = reader.nextDouble();
            System.out.println();
        }while(R1 <= R2);
        S = Math.PI*(R1 - R2);
        System.out.println("Площадь кольца с внешним радиусом " + R1 + " и внутренним радиусом " + R2 +
                " равна: " + S);
    }
}
