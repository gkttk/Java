package homework1.binaryOperators_1;

public class BinaryOperations {

    public static void info(int num_1, int num_2){
        System.out.println("Первое число - " + num_1 + ". В двоичной системе - " + Integer.toBinaryString(num_1));
        System.out.println("Второе число - " + num_2 + ". В двоичной системе - " + Integer.toBinaryString(num_2) + "\n");
        //Побитовые операторы
        System.out.println("Побитовое И(&) = " +  (num_1 % num_2) + ". В двоичной системе - " + Integer.toBinaryString(num_1 % num_2));
        System.out.println("Побитовое ИЛИ(|) = " + (num_1 | num_2) + ". В двоичной системе - " + Integer.toBinaryString(num_1 | num_2));
        System.out.println("Побитовое ИСКЛЮЧАЮЩЕЕ ИЛИ(^) = " + (num_1 ^ num_2) + ". В двоичной системе - " + Integer.toBinaryString(num_1 ^ num_2));
        System.out.println("Побитовый унарный оператор НЕ для числа:" + num_1 + " = " + ~num_1 + ". В двоичной системе - " + Integer.toBinaryString(~num_1));
        System.out.println("Побитовый унарный оператор НЕ для числа:" + num_2 + " = " + ~num_2 + ". В двоичной системе - " + Integer.toBinaryString(~num_2));
        System.out.println("\nСдвиги вправо");
        System.out.println("Сдвиг вправо(на 2 позиции) для числа:" + num_1 + " =  " + (num_1 >> 2) + ". В двоичной системе - " + Integer.toBinaryString(num_1 >> 2));
        System.out.println("Сдвиг вправо(на 2 позиции) для числа:" + num_2 + " =  " + (num_2 >> 2) + ". В двоичной системе - " + Integer.toBinaryString(num_2 >> 2));
        System.out.println("\nСдвиги влево");
        System.out.println("Сдвиг влево(на 2 позиции) для числа:" + num_1 + " = " + (num_1 << 2) + ". В двоичной системе - " + Integer.toBinaryString(num_1 << 2));
        System.out.println("Сдвиг влево(на 2 позиции) для числа:" + num_2 + " = " + (num_2 << 2) + ". В двоичной системе - " + Integer.toBinaryString(num_2 << 2));
        System.out.println("\nСдвиги вправо с заполнением нулями");
        System.out.println("Сдвиг вправо(на 2 позиции) с заполнением нулями для числа:" + num_1 + " = " + (num_1 >>> 2) + ". В двоичной системе - " + Integer.toBinaryString(num_1 >>> 2));
        System.out.println("Сдвиг вправо(на 2 позиции) с заполнением нулями для числа:" + num_2 + " = " + (num_2 >>> 2) + ". В двоичной системе - " + Integer.toBinaryString(num_2 >>> 2) + "\n");
    }//info

}//BinaryOperations
