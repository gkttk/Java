package homework7.сhecked_2;

import homework7.сhecked_2.exceptions.DontNeedHelloException;
import homework7.сhecked_2.exceptions.WhereIsHelloException;

public class Hello {

    public String world(String str) throws WhereIsHelloException, DontNeedHelloException {
        if(str.length() < 5 || !(str.substring(0,5).equalsIgnoreCase("hello"))){
            throw new WhereIsHelloException("Где ХЭЛЛО?");
        }
        else{
            return str + " world!";
        }
    }
}
