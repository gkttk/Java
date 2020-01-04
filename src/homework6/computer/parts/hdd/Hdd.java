package homework6.computer.parts.hdd;

import homework6.computer.parts.api.IParts;

import homework6.computer.parts.hdd.api.HddInterface;

public class Hdd implements IParts {
    private String id;
    private int capacityHdd;
    private HddInterface hddInterface;

    public Hdd(String id, int capacityHdd, HddInterface hddInterface) {
        this.id = id;
        this.capacityHdd = capacityHdd;
        this.hddInterface = hddInterface;
    }


    @Override
    public boolean check(Enum[] standarts) {
        for(Enum standart: standarts){
            if(standart == hddInterface){
                return true;
            }
        }
        return false;

    }


    @Override
    public String getID() {
        return id;
    }

}
