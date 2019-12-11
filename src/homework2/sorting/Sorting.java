package homework2.sorting;
import java.util.Random;
public class Sorting {

    public static void showArray(int[] arr){
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }//showArray

    public static void fillArray(int[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(20);
        }//заполнение массива случайными числами от 0 до 20
    }//fillArray

    public static void selection_1(int[] arr) {
        int index = 0, y = 0;
        int swap, max = 0;
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < arr.length - y; j++) {
                if (arr[j] >= max) {
                    index = j;
                    max = arr[j];
                }//if
            }//нахождение максимального значение в неотсортированной части
            y++;
            swap = arr[i];
            arr[i] = max;
            arr[index] = swap;
            max = 0;
        }//for
    }//сортировка выбором(1)

    public static void bubble_2(int[] arr){
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
        }//пузырьковая сортировка(2)

    public static void coctail_3(int[] arr){
        int right = arr.length-1, left = 0, swap = 0;
        do{
            for(int i = left; i < right; i++){
                if(arr[i] > arr[i+1]){
                    swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                }//if
            }//for
            right--;
            for(int i = right; i>left; i--){
                if(arr[i] < arr[i-1]){
                    swap = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = swap;
                }//if
            }//for
        }while(left < right);
    }//шейкерная сортировка(3)

    public static void insert_4(int[] arr){
        int swap = 0;
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0 && arr[j-1] > arr[j]; j--){
                swap = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = swap;
            }//for(j)
        }//for(i)
    }//сортировка с помощью включения(4)

    public static int[] merge_5(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i=0, j=0;
        for (int k=0; k<arr3.length; k++) {

            if (i > arr1.length-1) {
                int a = arr2[j];
                arr3[k] = a;
                j++;
            }
            else if (j > arr2.length-1) {
                int a = arr1[i];
                arr3[k] = a;
                i++;
            }
            else if (arr1[i] < arr2[j]) {
                int a = arr1[i];
                arr3[k] = a;
                i++;
            }
            else {
                int b = arr2[j];
                arr3[k] = b;
                j++;
            }
        }
        return arr3;
    }//сортировка слиянием двух отсортированных массивов(5)

    public static void quicksort_6(int[] arr, int start, int finish){
        int swap;
        if(arr.length == 0){
            return;
        }

        if(start >= finish){
            return;
        }

        int middle = start + (finish - start)/2;
        int opora = arr[middle];

        int i = start;
        int j = finish;

        while(i <= j){
            while(arr[i] < opora){
                i++;
            }//while
            while(arr[j] > opora){
                j--;
            }//while
            if(i <= j){
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }//if
        }//while

        if(start < j){
            quicksort_6(arr, start, j);
        }
        if(finish > i){
            quicksort_6(arr, i, finish);
        }


    }//quicksort(6)


    }//Sorting
