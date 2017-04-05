package AnagramTesting;

public class Anagram {

  public boolean isAnagramOrNot(String first, String second) {

    int firstLength = first.length();
    int secondLength = second.length();
    int count = 0;
    if (firstLength != secondLength) {
      return false;
    } else {
      for (int i = 0; i < firstLength; i++) {
        for (int j = 0; j < secondLength; j++) {
          if (first.charAt(i) == second.charAt(j)) {
            second = second.substring(0, j) + second.substring(j + 1, secondLength);
            secondLength--;
            count++;
            break;
          }
        }
      }
      if (count == firstLength) {
        return true;
      }
      else {
        return false;
      }
    }
  }
}
