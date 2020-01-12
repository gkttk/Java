package homework7.сhecked_2;

import homework7.сhecked_2.exceptions.DontNeedHelloException;

public class DontNeedHello extends Hello{

    @Override
    public String world(String str)throws DontNeedHelloException{
        if(str.length() <5 || !str.substring(0,5).equalsIgnoreCase("hello")){
            return str + " - хорошо что тут нет хэлло";
        }
        else {
            throw new DontNeedHelloException("Зачем Хэлло то?");
        }

    }
}

