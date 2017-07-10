import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean anagramChecker = isAnagram("word", "word");
        if (anagramChecker == true){
            System.out.println("The two words are anagrams");
        } else {
            System.out.println("The two words are not anagrams");
        }
    }

    public static boolean isAnagram(String input1, String input2) {
        int firstLength = toCompareFormat(input1).length();
        int secondLength = toCompareFormat(input2).length();
        boolean areWordsAnagrams;

        if (firstLength == secondLength) {
            String toCompare = toSortedCharArray(toCompareFormat(input1)).toString();
            String toCompare2 = toSortedCharArray(toCompareFormat(input2)).toString();

            areWordsAnagrams = (toCompare.equals(toCompare2));
            return areWordsAnagrams;
        }
        return false;
    }

    public static String toCompareFormat(String input) {
        String compareFormat = input.replaceAll("\\s", "").toLowerCase();
        return compareFormat;
    }

    public static ArrayList toSortedCharArray(String input){
        ArrayList<Character> charsOfInput = new ArrayList();
        for (char c : input.toCharArray()) {
            charsOfInput.add(c);
        }
        Collections.sort(charsOfInput);
        return charsOfInput;
    }
}
