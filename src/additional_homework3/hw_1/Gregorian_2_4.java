package additional_homework3.hw_1;
import java.util.Scanner;

public class Gregorian_2_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int day, month, year;
        int[] months = {31, 28 , 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leap_year = false;
        System.out.println("Введите число, месяц и год");
        day = reader.nextInt();
        month = reader.nextInt();
        year = reader.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 == 0){
                leap_year = true;
            }
             else if(year % 100 == 0){
                 leap_year = false;
            }
             else
            {
                leap_year = true;
            }
        }//if1

        if(leap_year){
            months[1]++;
            if(day == 31 && month == 12){
                System.out.println("Следующее число - 01.01." + (++year));
            }
            else if(months[month-1] == day) {
                System.out.println("Следующее число - 01." + (++month) + "." + year);
            }
            else if(day < months[month-1]){
                System.out.println("Следующее число - " + (++day) + "." +  month + "." + year);
            }

            }
        else{
            if(day == 31 && month == 12){
                System.out.println("Следующее число - 01.01." + (++year));
            }
            else if(months[month-1] == day) {
                System.out.println("Следующее число - 01." + (++month) + "." + year);
            }
            else if(day < months[month-1]){
                System.out.println("Следующее число - " + (++day) + "." +  month + "." + year);
            }
        }


    }
}
