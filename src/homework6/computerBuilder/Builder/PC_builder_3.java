package homework6.computerBuilder.Builder;

import homework6.computerBuilder.parts.api.IParts;
import homework6.computerBuilder.parts.cpu.Cpu;
import homework6.computerBuilder.parts.cpu.api.CpuSocket;
import homework6.computerBuilder.parts.hdd.Hdd;
import homework6.computerBuilder.parts.hdd.api.HddInterface;
import homework6.computerBuilder.parts.ram.Ram;
import homework6.computerBuilder.parts.ram.api.RamType;

public class PC_builder_3 extends ComputerBuilder{
    @Override
    public void buildId() {
        computer.setId("ПК №3");
    }

    @Override
    public void buildStandards() {
        Enum[] standards = {CpuSocket.INTEL, RamType.DDR2, HddInterface.SATA};
        computer.setStandards(standards);
    }

    @Override
    public void buildParts() {
        IParts[] parts = {new Cpu("INTEL_2", 2.4, CpuSocket.INTEL),
                new Ram("HyperX", 4, RamType.DDR2),
                new Hdd("Toshiba", 200, HddInterface.SATA)};
        computer.setParts(parts);


    }
}


