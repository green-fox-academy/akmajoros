import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter {
  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    int farSize = far.size();

    //Version1
    for (int i = 0; i < farSize; i++){
      far.set(i, far.get(i)+"a");
    }

    //Version2
    /*int i = 0;
    for(String currentElement : far) {
      String newName = currentElement+"a";
      far.set(i, newName);
      i++;
    }*/

    //Version3
    /*ArrayList<String> newList = new ArrayList();
    for(String currentElement : far){

      String newName = currentElement +  "a";
      newList.add(newName);
    }
    far = newList;*/

    System.out.println(far);

    //System.out.println(newList);
  }
}


