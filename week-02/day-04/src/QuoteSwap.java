import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    String swappingVariable = "cannot";

    list.set(5, list.get(2));
    list.set(2, swappingVariable);

    for (String sentence : list) {
      System.out.print( sentence + " ");
    }


    // Also, print the sentence to the output with spaces in between.
  }
}
