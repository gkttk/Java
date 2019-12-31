package homework4.garage_2;

import homework4.garage_2.Person.Driver;
import homework4.garage_2.Person.api.IDriver;
import homework4.garage_2.cars.car.Audi;
import homework4.garage_2.cars.api.ITransport;
import homework4.garage_2.parts.*;
import homework4.garage_2.parts.api.engine.FuelType;
import homework4.garage_2.parts.api.wheels.TypeWheels;


public class GarageMain {
    public static void main(String[] args) {
        ITransport car1 = new Audi("audi1", 40, new Engine("Двигатель1", 225, FuelType.ELECTRICITY), new Wheels("sdfsf", 12, 2, TypeWheels.WINTER), new Lock("123"));

        car1.changeWheels(new Wheels("sdfsf", 12, 4, TypeWheels.WINTER));

       IDriver driver = new Driver("Kirill", 'B', new Key("1233"), new Key("123"));
        driver.seatToTransport(car1, 2);
        driver.accelerator(car1);
        car1.refuel();
        driver.accelerator(car1);
        car1.getEngine().switchOn();
        driver.accelerator(car1);


    }
}
