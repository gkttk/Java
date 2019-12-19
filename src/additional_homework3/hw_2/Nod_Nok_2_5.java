package additional_homework3.hw_2;

import java.util.Scanner;

public class Nod_Nok_2_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b;
        System.out.println("Введите число a");
        a = reader.nextInt();
        System.out.println("Введите число b");
        b = reader.nextInt();
        System.out.printf("НОД чисел %d и %d равен %d", a, b, nod(a,b));
        System.out.printf("\n\nНОК чисел %d и %d равен %d", a, b, nok(a,b));

    }

    public static int nod(int num1, int num2) {
        int nod = 0;

        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0){
               for(int j = 1; j <= num2; j++){
                   if(num2 % j == 0 && j == i){
                       nod = j;
                   }
               }//for(j)
            }//if
        }//for(i)

        return nod;
        }//nod

    public static int nok(int num1, int num2){
        int nok = 0;
        int i = 0;
        while (true){
            if((num1+i) % num1 == 0){
                if((num1+i) % num2 == 0){
                    nok = num1 + i;
                    return nok;
                }
            }
            i++;
        }
    }
}
