package homework2.sorting;

public class Merge_5 {
    public static void main(String[] args) {

        int[] arr1 = {4, 6, 8, 11, 24, 57, 89, 111, 346, 574, 1098 , 1590, 1800};
        int[] arr2 = {1, 12, 67, 133, 143, 160, 201, 238, 344, 684, 2005};
        System.out.println("\nСортировка слиянием:");
        System.out.println("\nНеотсортированный массив 1");
        Sorting.showArray(arr1);
        System.out.println("\nНеотсортированный массив 2");
        Sorting.showArray(arr2);
        System.out.println("\nОтсортированный массив");
        Sorting.showArray(Sorting.merge_5(arr1, arr2));//сортировка слиянием с выводом на экран
    }
}
