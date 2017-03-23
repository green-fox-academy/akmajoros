import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();
    int girlSize = girls.size();
    int boySize = boys.size();

    for (int i = 0; i < girlSize; i++) {
      order.add(girls.get(i));
      order.add(boys.get(i));
    }
    System.out.println(order);
  }
}