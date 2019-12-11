package homework2.sorting;
import java.util.Scanner;

public class Cocktail_3 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] arr = new int[reader.nextInt()];
        System.out.println("\nШейкерная сортировка:");
        Sorting.fillArray(arr);
        System.out.println("\nНеотсортированный массив");
        Sorting.showArray(arr);
        Sorting.coctail_3(arr);//шейкерная сортировка
        System.out.println("\nОтсортированный массив");
        Sorting.showArray(arr);
    }
}
