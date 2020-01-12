package homework6.computerBuilder;


import homework6.computerBuilder.Builder.*;

public class ComputerBuilderMain {
    public static void main(String[] args) {
    Director director = new Director();
    director.setComputerBuilder(new PC_builder_1());
    Computer comp1 = director.buildComputer();
        System.out.println(comp1.toString());
        comp1.start();
    }
}
