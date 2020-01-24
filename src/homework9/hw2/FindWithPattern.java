package homework9.hw2;

import homework9.hw2.api.FindString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWithPattern implements FindString {
    @Override
    public int howManyWords(String book, String word) {
        int count = 0;
        String forPattern = "\\b" + "(" + Character.toUpperCase(word.charAt(0)) + "|"
                + Character.toLowerCase(word.charAt(0)) + ")" + word.substring(1) + "\\b";
        Pattern pt = Pattern.compile(forPattern);
        Matcher matcher = pt.matcher(book);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
