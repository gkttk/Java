package homework8.hw3;


//Класс, реализующий интерфейс Comparable для сортировки элементов в коллекциях, которые их сортируют автоматически
public class ComparableTest implements Comparable<ComparableTest>{
    private int id;

    ComparableTest(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override //переопределенный метод задает алгоритм сортировки (сортировка по величине ID)
    public int compareTo(ComparableTest o) {
        if (this.id > o.getId()) {
            return 1;
        }
        if (this.id < o.getId()) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                '}';
    }
}
