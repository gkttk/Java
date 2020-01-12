package homework7.console_3_4;

import java.util.*;

public class ConsoleMain {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[5];
    int number, count = 0;
        System.out.println("Заполните массив");
    for(int i = 0; i < arr.length; i++){
        try{
            number = Integer.parseInt(scanner.nextLine());
            arr[i] = number;
        }
        catch(Exception e){
            System.out.println("Введите целое число");
            count++;
            i--;
        }
        if(count == 3){
            throw new CountEqual3Exception("3 попытки исчерпаны");
        }
    }

    ArrayList<Integer> list = new ArrayList<>();
         for(int num: arr){
             list.add(num);
         }
        System.out.println("Массив в коллекцию ArrayList");
        System.out.println(list.toString());
        System.out.println("Сортировка");
         Collections.sort(list);
        System.out.println(list.toString());




   /* while(true){
    System.out.println("Введите целое число в консоль");
    try{
        number = Integer.parseInt(scanner.nextLine());
        listInt.add(number);
    }
    catch(Exception e){
        System.out.println("\nВы ввели не целочисленное число");
        count++;
    }
    if(count == 3){
       break;
    }

    }*/
}
}
