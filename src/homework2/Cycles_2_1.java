package homework2;
import java.util.Scanner;
public class Cycles_2_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        System.out.print("Введите размер массива: ");
        int[] arr = new int[reader.nextInt()];

        for(int j = 0; j < arr.length; j++){
            System.out.print("\nВведите " + (j+1) + " элемент массива: ");
            arr[j] = reader.nextInt();
        }//заполнение массива

        System.out.println("\nВывод массива на экран:");
        do{
            System.out.print(arr[i] + " ");
            i++;
        }while(i < arr.length);
        System.out.println("\nЦикл do...while отработал\n");
        i = 0;

        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("\nЦикл while отработал\n");

        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nЦикл for отработал\n");

        for(int arg : arr){
            System.out.print(arg + " ");
        }
        System.out.println("\nЦикл foreach отработал\n");

    }//main
}
