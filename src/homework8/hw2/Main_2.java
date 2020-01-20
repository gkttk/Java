package homework8.hw2;

import homework8.Passport;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        List<Passport> list1 = new ArrayList<>();

        for(int i = 0; i<100; i++){
            list1.add(new Passport("ID", new Date(), "ФИО"));
        }

        System.out.println("Количество элементов в листе - " + list1.size());

        Iterator iterator = list1.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println("Количество элементов в листе - " + list1.size());
    }
}
