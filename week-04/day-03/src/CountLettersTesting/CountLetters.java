package CountLettersTesting;

import java.util.HashMap;

public class CountLetters {
  public HashMap countLetters(String wordToCount) {
    HashMap<Character, Integer> dictionary = new HashMap<>();

    for (int i = 0; i < wordToCount.length(); i++) {
      int occurence = 0;
      if (!dictionary.containsKey(wordToCount.charAt(i))) {
        dictionary.put(wordToCount.charAt(i), occurence);
      }

      for (int j = 0; j < wordToCount.length(); j++) {
        if (wordToCount.charAt(j) == wordToCount.charAt(i)) {
          occurence++;
        }
      }
    }
    return dictionary;
  }
}
