package additional_homework3.hw_1;
import java.util.Scanner;

public class Sequence_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        do{
            System.out.println("Введите четырехзначное число");
            num = reader.nextInt();
        }while(num < 1000 || num >= 10000);
        if(num/1000 < num/100%10 && num/100%10 < num/10%10 && num/10%10 < num%10){
            System.out.println("Цифры четырехзначного числа " + num + " образуют возрастающую последовательность");
        }
        else if(num/1000 > num/100%10 && num/100%10 > num/10%10 && num/10%10 > num%10){
            System.out.println("Цифры четырехзначного числа " + num + " образуют убывающую последовательность");
        }
        else{
            System.out.println("Цифры четырехзначного числа " + num + " не образуют возрастающей/убывающей последовательности");
        }
    }
}
