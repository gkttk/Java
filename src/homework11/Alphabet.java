package homework11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;

public class Alphabet {
    public static String alphabet = "абвгдеёжзиёклмнопрстхцчшщьыъэюя";
    private static Random rand = new Random();

    public static char randChar(){
        return alphabet.charAt(rand.nextInt(alphabet.length()-1));
    }


}
