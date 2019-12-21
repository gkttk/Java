package additional_homework3.hw_1;
import java.util.Scanner;
public class Average_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int N;
        double average = 0, geom = 1;
        do{
            System.out.println("Введите шестизначное число");
            N = reader.nextInt();
        }while(N < 100000 || N >= 1000000);
        String string_N =  Integer.toString(N);
        for(int i = 0 ; i < 6; i++){
            average += Integer.parseInt(String.valueOf(string_N.charAt(i)));
            geom *= Integer.parseInt(String.valueOf(string_N.charAt(i)));
        }
        average /= 6;
        geom = Math.pow(geom, 1.0/6);
        System.out.println("Среднее арифметическое числа " + N + " равно " + average + "\n" +
                "Среднее геометрическое числа " + N + " равно " + geom);

    }
}
