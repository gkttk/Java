package homework4.garage_2.parts;

import homework4.garage_2.parts.api.wheels.*;


import java.util.Scanner;

public class Wheels implements IWheels {

    private String id;
    private int radius;
    private int numberOfWheels;
    private TypeWheels typeWheels;


    public Wheels(){
        Scanner reader = new Scanner(System.in);
        int choose;

        System.out.println("Введите параметры набора колес\nВведите идентификатор");
        this.id = reader.nextLine();
        System.out.println("Введите радиус колес");
        this.radius = reader.nextInt();
        System.out.println("Введите количество колес в комплекте");
        this.numberOfWheels = reader.nextInt();
        do {
            System.out.println("Выберите сезонность комплекта колес");
            System.out.println("1. Зимние\n2. Летние\n3. Всесезонные");
            choose = reader.nextInt();
        }while(choose < 1 || choose > 3);//do,while
        switch(choose){
            case 1:
                this.typeWheels = TypeWheels.WINTER;
                break;
            case 2:
                this.typeWheels = TypeWheels.SUMMER;;
                break;
            default:
                this.typeWheels = TypeWheels.ALL_SEASONS;;
        }//switch
    }//constructor()

    public Wheels(String id, int radius, int numberOfWheels, TypeWheels type){
        this.id = id;
        this.radius = radius;
        this.numberOfWheels = numberOfWheels;
        this.typeWheels = type;

    }//constructor(+)


    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public TypeWheels getType() {
        return typeWheels;
    }


    @Override
    public void getWheelsData() {
        System.out.println("\nИнформация по колесам:\nНаименование - " + id + "\nРадиус - " + radius +
                "\nТип колес - " + typeWheels.toString(typeWheels));
    }
}
