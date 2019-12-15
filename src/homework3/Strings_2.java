package homework3;

public class Strings_2 {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 = "Мама" + " мыла " + "раму";//оператор + не добавляет пробелы
        System.out.println(str1 == str2);/*строки созданы с помощью литералов -
         одинаковые по наполнению(с учетом регистра) строки попадают в String pool.
         Строки str1 и str2 ссылаются на один и тот же объект*/

    }
}
