package homework4.garage_2;

import homework4.garage_2.api.ICar;
import homework4.garage_2.cars.*;
import homework4.garage_2.enums.*;

public class GarageMain {
    public static void main(String[] args) {
        ICar car1 = new Mercedes();//"стоковый" Мерседес без колес и двигателя
        car1.go();//нельзя ехать без колес
        car1.changeWheels();//ставим стандартные для всех колеса
        car1.go();//нужно завести автомобиль
        car1.start();//чтобы завести автомобиль нужно попасть внутрь
        car1.open();//необходим ключ
        car1.open(TypeOfKey.KEY_BMW);//ключ от БМВ не подходит Мерседесу
        car1.open(TypeOfKey.KEY_MERCEDES);//дверь открыта
        car1.start();//у Мерседеса все еще нет двигателя, завести не получится
        car1.changeEngine();//устанавливаем стандартный для всех двигатель
        car1.start();//нет бензина
        car1.refuel();//заправляемся...
        car1.start();//автомобиль завелся
        car1.go();//поехали
        car1.stop();//остановились и заглушили мотор
        car1.go();//нужно снова завести автомобиль
        car1.start();//нужна дозаправка
        car1.getData();//получение информации о car1

    }
}
