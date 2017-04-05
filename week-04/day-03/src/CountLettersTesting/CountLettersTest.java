package CountLettersTesting;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

  @Test
  public void counterTester() {
    CountLetters countLetter = new CountLetters();
    String string = "pmmttTT";
    HashMap<Character, Integer> testHashMap = new HashMap<>();
    testHashMap.put('p', 1);
    testHashMap.put('m', 2);
    testHashMap.put(' ', 0);
    testHashMap.put('t', 4);
    assertEquals(testHashMap, countLetter.countLetters(string));
  }
 }