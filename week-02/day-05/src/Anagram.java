import java.util.*;

public class Anagram {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Please give me a string: ");
    String firstWord = input1.nextLine();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Please give me another string: ");
    String secondWord = input2.nextLine();
    String compareFormat1 = firstWord.replaceAll("\\s", "").toLowerCase();
    String compareFormat2 = secondWord.replaceAll("\\s", "").toLowerCase();

     int firstLength = compareFormat1.length();
     int secondLength = compareFormat2.length();

     if (firstLength == secondLength) {
       ArrayList<Character> charsWord1 = new ArrayList();
       for (char c : compareFormat1.toCharArray()) {
         charsWord1.add(c);
       }
       Collections.sort(charsWord1);

       ArrayList<Character> charsWord2 = new ArrayList<Character>();
       for (char c : compareFormat2.toCharArray()) {
         charsWord2.add(c);
       }
       Collections.sort(charsWord2);

       charsWord1.toString();
       charsWord2.toString();

       String toCompare = charsWord1.toString();
       String toCompare2 = charsWord2.toString();

       boolean isAnagram = (toCompare.equals(toCompare2));
       if (isAnagram){
         System.out.println("true");
       } else if (isAnagram == false){
         System.out.println("false");
       }
     }
     else {
       System.out.println("false");
     }

  }
}
