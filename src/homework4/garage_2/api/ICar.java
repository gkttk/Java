package homework4.garage_2.api;
import homework4.garage_2.enums.*;
import homework4.garage_2.parts.*;


public interface ICar {

    void go();
    void open();
    void open(TypeOfKey key);
    void close();
    void start();
    void stop();
    void changeWheels();
    void changeWheels(String s, double b, TypeOfWheels type);
    void changeWheels(Wheels e);
    void changeEngine();
    void changeEngine(String s, double b, TypeOfFuel type);
    void changeEngine(Engine e);
    void getData();
    void refuel();
}
