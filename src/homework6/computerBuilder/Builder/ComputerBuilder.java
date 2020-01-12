package homework6.computerBuilder.Builder;

import homework6.computerBuilder.Computer;

public abstract class ComputerBuilder{
    Computer computer;
    protected void createComputer(){
            computer = new Computer();
    }

    protected abstract void buildId();
    protected abstract void buildStandards();
    protected abstract void buildParts();

    protected Computer getComputer(){
        return computer;
    }
}
