package homework1.binaryOperators_1;

public class Homework_1_1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        BinaryOperations.info(a,b);//вызов статического метода info, класса BinaryOperations с аргументами a(42) и b(15)
        System.out.println("--------------------------------------------------------------------------------------------\n");
        a *= -1;//a = -42
        b *= -1;//b = -15
        BinaryOperations.info(a,b);//вызов статического метода info, класса BinaryOperations с аргументами a(-42) и b(-15)
    }//main
}//Homework_1_1
