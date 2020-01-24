package homework9.hw1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ILoveJava {
    public static void main(String[] args) {
        String str = "Я люблю JAVA";
        System.out.println("Через метод string.matches()");
        System.out.println(str + " Паттерн - h* Результат - " + str.matches("h*"));//false, matches проверяет всю строку на соответствие паттерну
        System.out.println(str + " Паттерн - h* Результат - " + str.matches("h+"));//false, matches проверяет всю строку на соответствие паттерну
        System.out.println(str + " Паттерн - h* Результат - " + str.matches("h?"));//false, matches проверяет всю строку на соответствие паттерну
        System.out.println();
        System.out.println("Через Matcher");
        Pattern pt = Pattern.compile("h*");
        Matcher matcher1 = pt.matcher(str);
        System.out.println("Через Matcher Паттерн - h* Результат - " + matcher1.find());//true Matcher ищет вхождение паттерна в строку, в текущей строке паттерну h*(буква h 0 или более раз) соответствует каждый символ
        pt = Pattern.compile("h+");
        matcher1 = pt.matcher(str);
        System.out.println("Через Matcher Паттерн - h+ Результат - " + matcher1.find());//false Matcher ищет вхождение паттерна в строку, в текущей строке паттерну h+(буква h 1 или более раз) не соответствует ни один символ
        pt = Pattern.compile("h?");
        matcher1 = pt.matcher(str);
        System.out.println("Через Matcher Паттерн - h? Результат - " + matcher1.find());//true Matcher ищет вхождение паттерна в строку, в текущей строке паттерну h*(буква h 0 или 1 раз) соответствует каждый символ



    }
}
