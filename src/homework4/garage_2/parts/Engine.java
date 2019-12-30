package homework4.garage_2.parts;

import homework4.garage_2.parts.api.engine.FuelType;
import homework4.garage_2.parts.api.engine.IEngine;

import java.util.Scanner;

public class Engine implements IEngine {
    private String id;
    private double capacity;
    private FuelType typeFuel;

    private boolean isOn = false;



    public Engine(){
        Scanner reader = new Scanner(System.in);
        int choose;

        System.out.println("Введите параметры двигателя\nВведите идентификатор");
        this.id = reader.nextLine();
        System.out.println("Введите объем");
        this.capacity = reader.nextDouble();

        do {
            System.out.println("Выберите тип топлива");
            System.out.println("1. Бензин\n2. Дизель\n3. Электричество");
            choose = reader.nextInt();
        }while(choose < 1 || choose > 3);//do,while
        switch(choose){
            case 1:
                this.typeFuel = FuelType.GASOLINE;
                break;
            case 2:
                this.typeFuel = FuelType.DIESEL;
                break;
            default:
                this.typeFuel = FuelType.ELECTRICITY;
        }//switch
    }//constructor()

    public Engine(String id, double capacity, FuelType type){
        this.id = id;
        this.capacity = capacity;
        this.typeFuel = type;
    }//constructor(+)

    @Override
    public void switchOn() {
        isOn = true;
    }

    @Override
    public void switchOff() {

    }

    @Override
    public boolean getEngineCondition() {
        return isOn;
    }

    @Override
    public String getEngineId() {
        return id;
    }

    @Override
    public double getEngineCapacity() {
        return capacity;
    }

    @Override
    public FuelType getFuelType() {
        return typeFuel;
    }

    @Override
    public void getEngineData() {
        System.out.println("\nИнформация по двигателю:\nНаименование - " + id + "\nОбъем - " + capacity +
                "\nТип двигателя - " + typeFuel.toString(typeFuel));
    }
}
