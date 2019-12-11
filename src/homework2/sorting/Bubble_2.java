package homework2.sorting;
import java.util.Scanner;

public class Bubble_2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] arr = new int[reader.nextInt()];
        System.out.println("\nПузырьковая сортировка:");
        Sorting.fillArray(arr);
        System.out.println("\nНеотсортированный массив");
        Sorting.showArray(arr);
        Sorting.bubble_2(arr);//сортировка пузырьком
        System.out.println("\nОтсортированный массив");
        Sorting.bubble_2(arr);
        Sorting.showArray(arr);

    }//main
}
