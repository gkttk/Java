package homework2;

public class Multiplication_1_3 {
    public static void main(String[] args) {
        if(args.length > 0){
            int mult = 1;
            for (String num : args){
                mult *= Integer.parseInt(num);
            }
            System.out.println("Результат умножения всех введенных аргументов: " + mult);
        }
    }
}
