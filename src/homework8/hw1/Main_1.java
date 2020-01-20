package homework8.hw1;

import homework8.Passport;

import java.util.*;

public class Main_1 {
    public static void main(String[] args) {
        List<Passport> arrList = new ArrayList<>();
        List<Passport> linkedList = new LinkedList<>();

        checkAddList(arrList); //замер времени добавления для ArrayList(~185 миллисекунд)
        checkAddList(linkedList); //замер времени добавления для LinkedList(~1349 миллисекунда)

        // checkRemoveList(arrList);//замер времени удаления для ArrayList(~126712 миллисекунд)
        //checkRemoveList(linkedList);//замер времени удаления для LinkedList(~20 миллисекунд)

    }

    private static void checkAddList(List<Passport> list){
        long start, finish;
        String str;
        Random rand = new Random();
        start = System.currentTimeMillis();//замер времени перед добавлением
        for(int i = 0; i<1_000_000; i++){
            str = "" + rand.nextInt(1_000_000);//генерация строки для id,
            list.add(new Passport(str, new Date(), "Зубенко Михаил Петрович"));
        }
        finish = System.currentTimeMillis() - start;//замер времени после добавления
        System.out.println("Добавлено за время " + finish);
    }//метод замеряет время добавления элементов в, зависимости от типа переданного листа(1_000_000 элементов)

    private static void checkRemoveList(List<Passport> list){
        if(list.isEmpty()){
            System.out.println("Лист пустой");
            return;
        }
        long start, finish;
        Iterator iterator = list.iterator();
        start = System.currentTimeMillis(); // замер времени перед удалением
      while(iterator.hasNext()){
          iterator.next();
          iterator.remove();
      }
        finish = System.currentTimeMillis();//замер времени после удаления
        System.out.println("Удалено за время " + (finish - start));
    }//метод замеряет время удаления всех элементов, в зависимости от типа переданного листа
}
