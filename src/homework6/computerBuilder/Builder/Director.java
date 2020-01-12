package homework6.computerBuilder.Builder;

import homework6.computerBuilder.Computer;

public class Director {
    private ComputerBuilder computerBuilder;
  public  void setComputerBuilder(ComputerBuilder builder){
        this.computerBuilder = builder;
    }

  public Computer buildComputer(){
        computerBuilder.createComputer();
        computerBuilder.buildId();
        computerBuilder.buildStandards();
        computerBuilder.buildParts();
        return computerBuilder.getComputer();
    }
}
