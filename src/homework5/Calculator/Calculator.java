package homework5.Calculator;

import homework5.Calculator.api.ICalculator;

public class Calculator implements ICalculator {


    @Override
    public double sum(double... nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else {
            double sum = 0;
            for (double num : nums) {
               sum += num;
            }
            return sum;
        }
    }

    @Override
    public double minus(double... nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else {
            double minus = 0;
            for (double num : nums) {
                minus -= num;
            }
            return minus;
        }
    }

    @Override
    public double multiply(double... nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else {
            double multiply = 1;
            for (double num : nums) {
                multiply *= num;
            }
            return  multiply;
        }
    }

    @Override
    public double divide(double... nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else {
            double divide = 1;
            for (double num : nums) {
                if(num == 0){
                    System.out.println("Деление на ноль");
                    divide /= num;
                    return divide;
                }
                divide /= num;
            }
            return  divide;
        }
    }
}
