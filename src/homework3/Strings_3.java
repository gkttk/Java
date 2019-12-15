package homework3;
import java.util.Scanner;

public class Strings_3 {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         String str1 = "Мама мыла раму";
         System.out.print("Введите строку: ");
         String str2 = reader.nextLine();
         String str2interned = str2.intern(); /*метод intern() проверяет пул строк и ищет строку, подобную(equals) вызвавшему этот
        метод объекту(в данном случае введенной пользователем строке str2) и, если находит, возвращает ссылку на этот объект из String pool*/
        System.out.println(str1 == str2interned);//в итоге обе строки, при эквивалентности введенных пользователем символов, ссылаются на один и тот же адрес в String pool

    }
}
