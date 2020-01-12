package homework6.computerBuilder.Builder;

import homework6.computerBuilder.parts.api.IParts;
import homework6.computerBuilder.parts.cpu.Cpu;
import homework6.computerBuilder.parts.cpu.api.CpuSocket;
import homework6.computerBuilder.parts.hdd.Hdd;
import homework6.computerBuilder.parts.hdd.api.HddInterface;
import homework6.computerBuilder.parts.ram.Ram;
import homework6.computerBuilder.parts.ram.api.RamType;

public class PC_builder_1 extends ComputerBuilder{
    @Override
    public void buildId() {
        computer.setId("ПК №1");
    }

    @Override
    public void buildStandards() {
        Enum[] standards = {CpuSocket.AMD, RamType.DDR3, HddInterface.SATA};
        computer.setStandards(standards);
    }

    @Override
    public void buildParts() {
        IParts[] parts = {new Cpu("AMD", 3.4, CpuSocket.AMD),
                        new Ram("Corsair", 16, RamType.DDR3),
                        new Hdd("Seagate BarraCuda", 500, HddInterface.SATA)};
        computer.setParts(parts);


    }
}

