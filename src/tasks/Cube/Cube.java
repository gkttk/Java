package tasks.Cube;

import java.util.Scanner;

public class Cube {

    private double cubeFace;

    public Cube() {
        cubeFace = 1;
    }

    public double getCubeFace() {
        return cubeFace;
    }

    public Cube(double cubeFace) {
        this.cubeFace = cubeFace;
    }

    public static double areaCube(Cube cube) {
        return 6 * areaSide(cube);
    }//площадь куба

    public static double areaSide(Cube cube) {
        return Math.pow(cube.cubeFace, 2);
    } //площадь стороны куба

    public static double volumeCube(Cube cube) {
        return Math.pow(cube.cubeFace, 3);
    } //объем куба



    public void coordinate(Point point) {
        Scanner reader = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Какой координатной плоскостью рассекаем куб?");
            System.out.println("1. XY\n2. YZ\n3. XZ");
            choose = reader.nextInt();
        } while (choose < 1 || choose > 3);
            if(point.getX() == 0 || point.getY() == 0 || point.getZ() == 0){
                System.out.println("Куб лежит на рассекаемой плоскости");
                return;
            }
        switch (choose) {
            case 1:
                volumeParallelepiped(point.getZ());
                break;
            case 2:
                volumeParallelepiped(point.getX());
                break;
            default:
                volumeParallelepiped(point.getY());
                break;
        }


    }//рассечение куба одной из координатных плоскостей по переданной точке

    private void volumeParallelepiped(double coordinate) {
        if (coordinate > this.cubeFace) {
            System.out.println("Рассекающая плоскость находится за пределами куба");
        } else {
            double height1 = this.cubeFace - coordinate;
            double height2 = this.cubeFace - height1;
            if (Math.pow(cubeFace, 2) * height1 == Math.pow(cubeFace, 2) * height2) {
                System.out.println("Объемы полученных паралеллепипедов равны");
            } else {
                System.out.println("Объемы полученных паралеллепипедов неравны");
            }
        }
    }//сравнение объемов параллелепипедов после рссечения одной координатной плоскостью
}