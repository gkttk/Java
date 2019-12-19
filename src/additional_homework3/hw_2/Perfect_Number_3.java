package additional_homework3.hw_2;

import java.util.Objects;

public class Perfect_Number_3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 28;
        int c = 496;
        int d = 8128;
        perfect(a);
        perfect(b);
        perfect(c);
        perfect(d);

    }

    public static void perfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
       if(num == sum){
           System.out.printf("Число %d является совершенным\n", num);
       }
       else
       {
           System.out.printf("Число %d не является совершенным\n", num);
       }
    }

}
