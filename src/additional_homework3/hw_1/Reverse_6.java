package additional_homework3.hw_1;
import java.util.Scanner;

public class Reverse_6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        do {
            System.out.println("Введите семизначное число: ");
            sb.append(reader.nextLine());
            if (Integer.parseInt(sb.toString()) >= 1000000 && Integer.parseInt(sb.toString()) < 10000000) {
                break;
            }
            sb.setLength(0);
        }while(true);
        System.out.println(sb.reverse());
    }
}
