package homework4.garage_2.Person;

import homework4.garage_2.parts.api.key.IKey;
import homework4.garage_2.Person.api.IDriver;
import homework4.garage_2.cars.api.ITransport;


import java.util.ArrayList;
import java.util.Random;


public class Driver implements IDriver {
    private String name;
    private char driverLicense;
    private ArrayList<IKey> keys = new ArrayList<>();
    private boolean isInAuto = false;


    public Driver(String name, char license, IKey... key) {
        this.name = name;
        this.driverLicense = license;
        for (IKey keyN : key) {
            keys.add(keyN);
        }
    }


    @Override
    public void seatToTransport(ITransport transport, int numberOfPeople) {
        if (transport.getLock().getLockCondition()) {
            System.out.println("Сажусь в транспорт");
            transport.setNumberOfPeopleInside(numberOfPeople);
            isInAuto = true;
        } else {
            for (IKey key : keys) {
                if (key.getKey().equals(transport.getLock().getSecret())) {
                    if (!transport.getLock().getLockCondition()) {
                        transport.getLock().open(key);
                    }
                    if (!transport.getDoorCondition()) {
                        transport.openDoor();
                    }
                    System.out.println("Сажусь в авто");
                    transport.setNumberOfPeopleInside(numberOfPeople);
                    isInAuto = true;
                    return;
                }
            }
            System.out.println("У водителя нет подходящего ключа");
        }

    }

    public void accelerator(ITransport transport) {
        if (!isInAuto) {
            System.out.println("Сначала нужно сесть в автомобиль");
            return;
        }
        if (transport.getLicense() != driverLicense) {
            System.out.println("У водителя нет подходящих прав для управления данным автомобилем");
        } else {
            if (transport.tryToStart()) {
                transport.go();
                Random rand = new Random();
                double effort = rand.nextDouble();
                while (transport.consumption(effort)) {
                    effort = rand.nextDouble();
                }
                System.out.println("Топливо закончилось");
                transport.getEngine().switchOff();
                transport.stop();
                System.out.println("Проехано " + transport.getTraveled() + " км");
                transport.setTraveled();
            }
        }
    }

            @Override
            public String getName () {
                return name;
            }

            @Override
            public char getLicense () {
                return driverLicense;
            }

            @Override
            public ArrayList<IKey> getKeys () {
                return keys;
            }
        }

