package homework7.сhecked_2;

import homework7.сhecked_2.exceptions.WhereIsHelloException;

public class CheckedMain {
    public static void main(String[] args) {
        //метод world класса Hello выбрасывает исключение, если переданная строка не начинается со слова "hello"
    Hello hi = new Hello();
    try{
        System.out.println(hi.world("hello"));
        }
    catch(Exception e){
        e.printStackTrace();
        }
       /* переопределенный метод world класса DontNeedHello(расширяет класс Hello)
         выбрасывает исключение, если переданная строка начинается со слова "hello"*/
    DontNeedHello dontNeedHello = new DontNeedHello();//ко
    try{
        System.out.println(dontNeedHello.world("hello"));
    }
    catch(Exception e){
        e.printStackTrace();
    }





    }
}
