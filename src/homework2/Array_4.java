package homework2;
import homework2.sorting.Sorting;
import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        int count = 0;
        int j = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int[] arr = new int[reader.nextInt()];
        int arr_length = arr.length - 1;
        for(int k = 0; k < arr.length; k++){
            System.out.print("\nВведите " + (k+1) + " элемент массива: ");
            arr[k] = reader.nextInt();
        }//заполнение массива
        Sorting.showArray(arr);
        System.out.println("\nСортировка");
        Sorting.bubble_2(arr);
        Sorting.showArray(arr);
        System.out.println("\nУдаляем повторные элементы");
        for(int i = 0; i < arr_length; i++){
            if(arr[i] == arr[i+1]){
                count++;
                arr_length -= 1;
                for(j = i; j < arr.length-1;j++){
                arr[j] = arr[j+1];
                arr[j+1] = 0;
            }//for
                if(arr[i] == arr[i+1]){
                    i -= 1;

                }//if
            }//if
        }//for

       int[] arr2 = new int[arr.length - count];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[i];
        }
        Sorting.showArray(arr2);


    }
}
