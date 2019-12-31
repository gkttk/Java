package homework5.Calculator;

import homework5.Calculator.api.ICalculator;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator calculator1 = new Calculator();
        System.out.println(calculator1.sum(5,6));
        System.out.println(calculator1.minus(5,6));
        System.out.println( calculator1.multiply(5,6));
        System.out.println(calculator1.divide(5,0));
    }
}
