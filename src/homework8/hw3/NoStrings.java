package homework8.hw3;


import java.util.Collection;
import java.util.Iterator;
//класс убирает строки из коллекции
public class NoStrings {


    public void deleteStrings(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof String) {
                iterator.remove();

            }
        }

    }

}
