package homework6.computerBuilder.Builder;

import homework6.computerBuilder.parts.api.IParts;
import homework6.computerBuilder.parts.cpu.Cpu;
import homework6.computerBuilder.parts.cpu.api.CpuSocket;
import homework6.computerBuilder.parts.hdd.Hdd;
import homework6.computerBuilder.parts.hdd.api.HddInterface;
import homework6.computerBuilder.parts.ram.Ram;
import homework6.computerBuilder.parts.ram.api.RamType;

public class PC_builder_2 extends ComputerBuilder{
    @Override
    public void buildId() {
        computer.setId("ПК №2");
    }

    @Override
    public void buildStandards() {
        Enum[] standards = {CpuSocket.INTEL, RamType.DDR4, HddInterface.IDE};
        computer.setStandards(standards);
    }

    @Override
    public void buildParts() {
        IParts[] parts = {new Cpu("INTEL", 2.8, CpuSocket.INTEL),
                new Ram("Crucial", 8, RamType.DDR4),
                new Hdd("Western Digital", 350, HddInterface.IDE)};
        computer.setParts(parts);


    }
}


