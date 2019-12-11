package homework2.sorting;
import java.util.Scanner;
public class Quicksort_6 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] arr = new int[reader.nextInt()];
        System.out.println("\nБыстрая сортировка:");
        Sorting.fillArray(arr);
        System.out.println("\nНеотсортированный массив");
        Sorting.showArray(arr);
        Sorting.quicksort_6(arr, 0, arr.length-1);
        System.out.println("\nОтсортированный массив");
        Sorting.showArray(arr);
        int swap;
        for(int i = 1; i<arr.length; i++){
            for(int j = arr.length-1; j >= i; j--){
                if (arr[j] < arr[j - 1]){
                    swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;
                }//if
            }//for(j)
        }//for(i)
        Sorting.showArray(arr);



    }
}
