package homework6.computer;


import homework6.computer.parts.api.IParts;
import homework6.computer.parts.cpu.Cpu;
import homework6.computer.parts.cpu.api.CpuSocket;
import homework6.computer.parts.hdd.Hdd;
import homework6.computer.parts.hdd.api.HddInterface;
import homework6.computer.parts.ram.Ram;
import homework6.computer.parts.ram.api.RamType;

public class ComputerMain {
    public static void main(String[] args) {

        Enum[] standard1 = {CpuSocket.AMD, HddInterface.SATA, RamType.DDR3};
        IParts[] parts1 = {new Cpu("Процессор Интел", 3.700, CpuSocket.INTEL), new Hdd("ЖесткийСатаДиск", 500, HddInterface.SATA),
                new Ram("Barracuda", 8, RamType.DDR4)};
        Computer comp1 = new Computer(standard1, parts1);
        comp1.start();
    }
}
