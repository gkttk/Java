package homework2.sorting;
import java.util.Scanner;

public class Insert_4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] arr = new int[reader.nextInt()];
        System.out.println("\nСортировка с помощью включения:");
        Sorting.fillArray(arr);
        System.out.println("\nНеотсортированный массив");
        Sorting.showArray(arr);
        Sorting.insert_4(arr);//сортировка с помощью включения
        System.out.println("\nОтсортированный массив");
        Sorting.showArray(arr);

    }//main
}
