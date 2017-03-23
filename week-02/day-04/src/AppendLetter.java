import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter {
  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    int farSize = far.size();

    for (int i = 0; i < farSize; i++){
      far.set(i, far.get(i)+"a");
    }

      System.out.println(far);
  }
}


