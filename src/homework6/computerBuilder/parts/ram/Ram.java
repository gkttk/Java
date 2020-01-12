package homework6.computerBuilder.parts.ram;

import homework6.computerBuilder.parts.api.IParts;
import homework6.computerBuilder.parts.ram.api.RamType;

public class Ram implements IParts {
    private String id;
    private int capacityMemoryRam;
    private RamType ramType;

    public Ram(String id, int capacityMemoryRam, RamType ramType) {
        this.id = id;
        this.capacityMemoryRam = capacityMemoryRam;
        this.ramType = ramType;
    }


    @Override
    public boolean check(Enum[] standards) {
        for(Enum standard: standards){
            if(standard == ramType){
                return true;
            }
        }
        return false;

    }

    @Override
    public String getID(){return id;}

    @Override
    public String getInfo() {
        return "Ram - " + id +
                "\nCapacity Memory Ram - " + capacityMemoryRam +
                "\nRamType " + ramType;
    }

}
