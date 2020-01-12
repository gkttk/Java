package homework7.differentExceptions_5;

import java.io.FileNotFoundException;

public class DEMain {
    public static void main(String[] args) {
   /* try{
        difExceptions(false);
    }
    catch(FileNotFoundException e){
        System.out.println("Checked Exception FileNotFoundException");
    }
    catch(RuntimeException e){
        System.out.println("Unchecked Exception RuntimeException");

    }*/ //обработка двумя catch блоками

        try{
            difExceptions(false);
        }
        catch(FileNotFoundException | RuntimeException e){
            System.out.println("Исключение");
        } // обработка одним catch блоком


    }

    public static void difExceptions(boolean whatException) throws FileNotFoundException{
        if(!whatException){
            throw new RuntimeException("Unchecked Exception");
        }
        else{
            throw new FileNotFoundException("Checked Exception");
        }
    }
}
