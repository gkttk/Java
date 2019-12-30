package homework4.garage_2.Person;

import homework4.garage_2.parts.api.key.IKey;
import homework4.garage_2.Person.api.IDriver;
import homework4.garage_2.cars.api.ITransport;


import java.util.ArrayList;
import java.util.Random;


public class Driver implements IDriver {
    private String name;
    private char driverLicense;
    private ArrayList<IKey> keys= new ArrayList<>();
    private boolean isInAuto = false;



    public Driver(String name, char license, IKey ... key) {
        this.name = name;
      this.driverLicense = license;
      for(IKey keyN: key){
          keys.add(keyN);
      }
    }


    @Override
    public void seatToTransport(ITransport transport) {
        if (transport.getLock().getLockCondition()) {
            System.out.println("Сажусь в транспорт");
            isInAuto = true;
        } else {
            for (IKey key : keys) {
                if (key.getKey().equals(transport.getLock().getSecret())) {
                    if(!transport.getLock().getLockCondition()){
                        transport.getLock().open(key);
                    }
                    if(!transport.getDoorCondition())
                    {
                       transport.openDoor();
                    }
                    System.out.println("Сажусь в авто");
                    isInAuto = true;
                    return;
                }
            }
            System.out.println("У водителя нет подходящего ключа");
        }

    }

    public void accelerator(ITransport transport){
        if(!isInAuto){
            System.out.println("Сначала нужно сесть в автомобиль");
            return;
        }
        if(transport.getLicense() != driverLicense){
            System.out.println("У водителя нет подходящих прав для управления данным автомобилем");
        }
        else{
            transport.tryToStart();
            transport.go();
            double sum = 0;
            int km = 0;
            Random rand = new Random();
            while(sum <= transport.getEngine().getEngineCapacity()){
                sum += rand.nextDouble();
                km++;
            }
            System.out.println("Топливо закончилось");
            transport.getEngine().switchOff();
            transport.stop();
            System.out.println("Проехано " + km + " км");;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public char getLicense() {
        return driverLicense;
    }

    @Override
    public ArrayList<IKey> getKeys() {
        return keys;
    }
}
