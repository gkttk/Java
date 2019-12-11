package homework1.name_3;

import java.util.Objects;

public class Check {

   public static void iF(String name) {
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал.");
        }//if_1
        if (Objects.equals(name, "Анастасия")){
            System.out.println("Я тебя так долго ждал.");
        }//if_2
        if (!Objects.equals(name, "Вася") & !Objects.equals(name, "Анастасия")) {
            System.out.println("Добрый день, а вы кто?");
        }//if_3
    }//iF*/

    public static void ifElse(String name){
        if (Objects.equals(name,"Вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал.");
        }//if_1
        else if(Objects.equals(name,"Анастасия")) {
            System.out.println("Я тебя так долго ждал.");
        }//else_if_2
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }//ifElse

    public static void switCH(String name){
        switch(name){
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал.");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }//switch
    }//switCH
}//Check