package homework9.hw2;


import java.io.*;

public class Find {
    public static void main(String[] args) {
        try( FileInputStream stream = new FileInputStream("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework9\\hw2\\WarAndPeace.txt")){

        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);
        String book = new String(data);  //книга в строке

        FindWithPattern fwp = new FindWithPattern();
        System.out.println(fwp.howManyWords(book,"война")); //поиск через Pattern и Matcher

        FindWithString fws = new FindWithString();
        System.out.println(fws.howManyWords(book,"война"));//поиск через book.split() и str.matches()
        }
        catch(IOException e){
            System.out.println("Ошибка ввода-вывода");
        }



    }

}
