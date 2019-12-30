package homework4.garage_2.cars.car;

import homework4.garage_2.cars.api.ACars;
import homework4.garage_2.parts.api.engine.IEngine;
import homework4.garage_2.parts.api.lock.ILock;
import homework4.garage_2.parts.api.wheels.IWheels;

public class Mercedes extends ACars {
    private final String id = "Mercedes(Car)";
    private String model;



    public Mercedes(String model, IEngine engine, IWheels wheels, ILock lock) {
        this.model = model;
        this.engine = engine;
        this.lock = lock;

        if (wheels.getNumberOfWheels() >= getNumberOfWheels()) {
            this.wheels = wheels;
        } else {
            System.out.println("Колес недостаточно для данного типа транспорта, необходим другой комплект");
        }

    }//конструктор мерседеса


    @Override
    public void changeWheels(IWheels newWheels) {
        this.wheels = newWheels;
    }//замена колес

    @Override
    public void changeEngine(IEngine newEngine) {
        this.engine = newEngine;
    }//замена двигателя

    @Override
    public void changeLock(ILock newLock) {
        this.lock= newLock;
    }//замена замка

    @Override
    public void getData() {
        System.out.println("Автомобиль " + id + "\nМодель " + model + "\n");
        try {
            engine.getEngineData();
        } catch (NullPointerException e) {
            System.out.println("\nВ автомобиле нет двигателя");
        }

        try {
            wheels.getWheelsData();
        } catch (NullPointerException e) {
            System.out.println("\nВ автомобиле нет колес");
        }

    }//получение информации по деталям автомобиля
}
