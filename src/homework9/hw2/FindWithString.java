package homework9.hw2;

import homework9.hw2.api.FindString;

public class FindWithString implements FindString {
    @Override
    public int howManyWords(String book, String findWord) {
        int count = 0;
        String forPattern = "(\\p{P})*[" + findWord.toUpperCase() + findWord.toLowerCase() + "]" + "{" + findWord.length() + "}" +
                "(\\p{P})*";

        String[] words = book.split(" ");
        for (String word : words) {
            if (word.contains(Character.toLowerCase(findWord.charAt(0)) + findWord.substring(1)) || word.contains(Character.toUpperCase(findWord.charAt(0)) + findWord.substring(1))) {
                if (word.matches(forPattern)) {
                    count++;
                }
            }

        }
        return count;
    }
}
