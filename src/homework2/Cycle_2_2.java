package homework2;
import java.util.Scanner;

public class Cycle_2_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int[] arr = new int[reader.nextInt()];

        for(int j = 0; j < arr.length; j++){
            System.out.print("\nВведите " + (j+1) + " элемент массива: ");
            arr[j] = reader.nextInt();
        }//заполнение массива
        System.out.println("\nКаждый второй элемент массива:");
        for(int i = 1; i < arr.length; i+=2){
            System.out.print(arr[i] + " ");
        }
    }
}
