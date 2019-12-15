package homework3;
import homework3.sort.Sorting;

import java.util.Scanner;
import java.util.Random;


public class Sort_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
       int choose;
        do{
            System.out.println("\n1. Сортировка выбором\n" +
                    "2. Пузырьковая сортировка\n" +
                    "3. Шейкерная сортировка\n" +
                    "4. Сортировка с помощью включения\n" +
                    "5. Сортировка слиянием\n" +
                    "6. Быстрая сортировка\n" +
                    "0. Выход");
            System.out.println("Выберите вариант сортировки:");
            choose = reader.nextInt();
            switch(choose){
                case 1:
                    System.out.print("Введите размер массива: ");
                    int[] arr = new int[reader.nextInt()];
                    Sorting.fillArray(arr);
                    System.out.println("\nМассив до сортировки:");
                    Sorting.showArray(arr);
                    System.out.println("\n\nСортировка выбором");
                    Sorting.selection_1(arr);
                    System.out.println("Массив после сортировки:");
                    Sorting.showArray(arr);
                    break;
                case 2:
                    System.out.print("Введите размер массива: ");
                    int[] arr2 = new int[reader.nextInt()];
                    Sorting.fillArray(arr2);
                    System.out.println("\nМассив до сортировки:");
                    Sorting.showArray(arr2);
                    System.out.println("\n\nПузырьковая сортировка");
                    Sorting.bubble_2(arr2);
                    System.out.println("Массив после сортировки:");
                    Sorting.showArray(arr2);
                    break;
                case 3:
                    System.out.print("Введите размер массива: ");
                    int[] arr3 = new int[reader.nextInt()];
                    Sorting.fillArray(arr3);
                    System.out.println("\nМассив до сортировки:");
                    Sorting.showArray(arr3);
                    System.out.println("\n\nШейкерная сортировка");
                    Sorting.coctail_3(arr3);
                    System.out.println("Массив после сортировки:");
                    Sorting.showArray(arr3);
                    break;
                case 4:
                    System.out.print("Введите размер массива: ");
                    int[] arr4 = new int[reader.nextInt()];
                    Sorting.fillArray(arr4);
                    System.out.println("\nМассив до сортировки:");
                    Sorting.showArray(arr4);
                    System.out.println("\n\nСортировка с помощью включения");
                    Sorting.insert_4(arr4);
                    System.out.println("Массив после сортировки:");
                    Sorting.showArray(arr4);
                    break;
                case 5:
                    System.out.print("Введите размер первого массива: ");
                    int[] arr5 = new int[reader.nextInt()];
                    Sorting.fillArray(arr5);
                    Sorting.bubble_2(arr5);//сортировка первого массива
                    System.out.print("Введите размер второго массива: ");
                    int[] arr6 = new int[reader.nextInt()];
                    Sorting.fillArray(arr6);
                    Sorting.bubble_2(arr6);//сортировка второго массива
                    System.out.println("\nМассив до сортировки слиянием:");
                    Sorting.showArray(arr5);
                    System.out.println("\nМассив до сортировки слиянием:");
                    Sorting.showArray(arr6);
                    System.out.println("\n\nСортировка слиянием");
                   int[] arr7 = Sorting.merge_5(arr5, arr6);
                    System.out.println("Массив после сортировки:");
                    Sorting.showArray(arr7);
                    break;
                case 6:
                    System.out.print("Введите размер массива: ");
                    int[] arr8 = new int[reader.nextInt()];
                    Sorting.fillArray(arr8);
                    System.out.println("\nМассив до сортировки:");
                    Sorting.showArray(arr8);
                    System.out.println("\n\nБыстрая сортировка");
                    Sorting.quicksort_6(arr8, 0 , arr8.length - 1);
                    System.out.println("Массив после сортировки:");
                    Sorting.showArray(arr8);
                    break;
                case 0:
                    System.out.println("Вы вышли из программы");
                default:
                    System.out.println("Такого варианта нет");
            }
        }while(choose != 0);


    }//main
}
