package homework8.hw3;

import java.util.*;

public class FilterApplicator {

    public static void main(String[] args) {
        ComparableTest[] cT = {new ComparableTest(15), new ComparableTest(24), new ComparableTest(4),
            new ComparableTest(3), new ComparableTest(76), new ComparableTest(1), new ComparableTest(8)};

        ArrayList<ComparableTest> list = new ArrayList<>(Arrays.asList(cT));
        Set<ComparableTest> set = new HashSet<>(Arrays.asList(cT));

        System.out.println("Автоматически отсортированный ArrayList :" + sort(list));//по факту TreeSet, т.к. он сортирует элементы автоматически, используя compareTo
        System.out.println("Автоматически отсортированный HashSet :" + sort(set));//по факту TreeSet, т.к. он сортирует элементы автоматически, используя compareTo


        ArrayList list2 = new ArrayList();//не параметризированный лист, хранит objects
        list2.add("Строка1");
        list2.add(12);
        list2.add("Строка2");
        list2.add(155);
        list2.add("Строка3");

        System.out.println(list2);
        System.out.println(filter(list2, new NoStrings()));

    }
    //3.1
   public static Collection filter(Collection collection, NoStrings filtr) {
        filtr.deleteStrings(collection);
        return collection;
    }

    //3.2
    public static <T extends Comparable> Collection sort(Collection<T> collection) {
        Set<T> tree = new TreeSet<>(collection);
        return tree;

    }


}
