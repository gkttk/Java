package homework4.garage_2.cars.truck;


import homework4.garage_2.cars.api.ATrucks;
import homework4.garage_2.parts.api.engine.IEngine;
import homework4.garage_2.parts.api.lock.ILock;
import homework4.garage_2.parts.api.wheels.IWheels;

public class Kamaz extends ATrucks {
    private final String id = "Kamaz(Truck)";
    private String model;



    public Kamaz(String model, IEngine engine, IWheels wheels, ILock lock) {
        this.model = model;
        this.engine = engine;
        this.lock = lock;

        if (wheels.getNumberOfWheels() >= getNumberOfWheels()) {
            this.wheels = wheels;
        } else {
            System.out.println("Колес недостаточно для данного типа транспорта, необходим другой комплект");
        }

    }//конструктор камаза


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
