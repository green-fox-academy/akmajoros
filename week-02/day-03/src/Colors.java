import java.util.Arrays;

public class Colors {
  public static void main(String[] args) {
    String[][] color = {
      {"lime", "forest green", "olive", "pale green", "spring green"},
      {"orange red", "red", "tomato"},
      {"orchid", "violet", "pink", "hot pink"},
    };
    for (int i=0; i<color.length; i++) {
      System.out.println(Arrays.toString(color[i]));
    /*System.out.println(Arrays.toString(color[0]));
    System.out.println(Arrays.toString(color[1]));
    System.out.println(Arrays.toString(color[2]));*/
    }
  }
}
