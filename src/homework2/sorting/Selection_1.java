package homework2.sorting;

import java.util.Scanner;

public class Selection_1 {
    public static void main(String[] args) {

         Scanner reader = new Scanner(System.in);
         System.out.print("Введите размер массива: ");
         int[] arr = new int[reader.nextInt()];
         System.out.println("\nСортировка выбором:");
         Sorting.fillArray(arr);
         System.out.println("\nНеотсортированный массив");
         Sorting.showArray(arr);
         Sorting.selection_1(arr);//сортировка выбором
         System.out.println("\nОтсортированный массив");
         Sorting.showArray(arr);

    }//main
}
