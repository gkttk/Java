package additional_homework3.hw_1;
import java.util.Scanner;

public class Symbol_2_3 {
    public static void main(String[] args) {
      char[] c;
      char[] rus = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
      char[] eng = {'a', 'e', 'i', 'o', 'u'};
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Введите букву");
            c = reader.nextLine().toCharArray();
        }while(c.length != 1);

       if(Character.isDigit(c[0])){
           System.out.println("Это цифра");
           }
       else if(Character.isLetter(c[0])){
           System.out.println("Это буква");
           for(char sym : rus){
               if(sym == c[0]){
                   System.out.println("Это гласная");
               }
           }
           for(char sym : eng){
               if(sym == c[0]){
                   System.out.println("Это гласная");
               }
           }
       }
       else{
           System.out.println("Это символ");
       }

    }
}
