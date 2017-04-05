package AnagramTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  @Test
  public void anagrTest(){
    Anagram anagram = new Anagram();
    assertTrue(anagram.isAnagramOrNot("first", "first"));
  }
}