package homework6.computerBuilder.parts.cpu;

import homework6.computerBuilder.parts.api.IParts;
import homework6.computerBuilder.parts.cpu.api.CpuSocket;

public class Cpu implements IParts {
    private String id;
    private double speed;
    private CpuSocket socket;

    public Cpu(String id, double speed, CpuSocket socket) {
        this.id = id;
        this.speed = speed;
        this.socket = socket;
    }


    @Override
    public boolean check(Enum[] standarts) {
        for(Enum standart: standarts){
            if(standart == socket){
                return true;
            }
        }
        return false;

    }

    @Override
    public String getID(){return id;}

    @Override
    public String getInfo() {
        return "Cpu - " + id +
                "\nSpeed Cpu - " + speed +
                "\nCpuSocket " + socket;
    }
}
