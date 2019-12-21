package additional_homework3.hw_1;
import java.util.Scanner;
public class Trangle_2_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3, xy1_2, xy2_3, xy3_1, summ , max = 0;
        boolean trangle = false;
        System.out.println("Введите координаты первой точки(x1,y1):");
        x1 = reader.nextDouble();
        y1 = reader.nextDouble();
        System.out.println("Введите координаты второй точки(x2,y2):");
        x2 = reader.nextDouble();
        y2 = reader.nextDouble();
        System.out.println("Введите координаты третьей точки(x3,y3):");
        x3 = reader.nextDouble();
        y3 = reader.nextDouble();

        xy1_2 = Math.sqrt( (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) );
        xy2_3 = Math.sqrt( (Math.pow(x2 - x3, 2)) + (Math.pow(y2 - y3, 2)) );
        xy3_1 = Math.sqrt( (Math.pow(x3 - x1, 2)) + (Math.pow(y3 - y1, 2)) );
        System.out.print("Первая сторона = " + xy1_2);
        System.out.print("\nВторая сторона = " + xy2_3);
        System.out.print("\nТретья сторона = " + xy3_1);
        summ = xy1_2 + xy2_3 + xy3_1;
        if(xy1_2 < summ && xy2_3 < summ && xy3_1 < summ){
            System.out.println("\nТочки образуют треугольник");
            trangle = true;
            if(xy1_2 >= xy2_3 && xy1_2 >= xy3_1){
                max = xy1_2;
                xy1_2 = 0;
            }
            else if(xy2_3 >= xy1_2 && xy2_3 >= xy3_1){
                max = xy2_3;
                xy2_3 = 0;
            }
            else{
                max = xy3_1;
                xy3_1 = 0;
            }
        }

        while(trangle){
            if(Math.pow(max,2) == (Math.pow(xy1_2,2) + Math.pow(xy2_3,2) + Math.pow(xy3_1,2))){
                System.out.println("\nТреугольник прямоугольный");
            }
            else
            {
                System.out.println("Треугольник не прямоугольный");
            }
                trangle = false;
            }



    }
}
