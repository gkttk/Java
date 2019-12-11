package homework2;

public class Factorial_1_2 {
    public static void main(String[] args) {
        if(args.length > 0) {
          for(int i = 0; i < args.length; i++){
                System.out.print("Факториал следующиего аргумента: " + fact(Integer.parseInt(args[i])) + "\n");
            }//for
        }//if
    }//main

    public static int fact(int num){
        if(num == 1){
            return 1;
        }//if
        return num * fact(num - 1);
    }//fact
}
