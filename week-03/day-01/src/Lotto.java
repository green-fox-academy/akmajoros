import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lotto {
  public static void main(String[] args) {
    Path filePath = Paths.get("assets/otos.csv");

    try {
      List<String> lines = Files.readAllLines(filePath);
      HashMap<String, Integer> winnerNumbers = new HashMap<String, Integer>();

      for(String line : lines){
        String[] linesArray = line.split(";");
        int sizeTo = linesArray.length;
        int sizeFrom = sizeTo - 5;
        for (int i = sizeFrom; i < sizeTo; i++){
          if (winnerNumbers.containsKey(linesArray[i])){
            winnerNumbers.put(linesArray[i], winnerNumbers.get(linesArray[i]) + 1);
          } else {
            winnerNumbers.put(linesArray[i], 0);
          }
        }
      }
      Set<Map.Entry<String, Integer>> set = winnerNumbers.entrySet();
      List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
              set);
      Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

        public int compare(Map.Entry<String, Integer> o1,
                           Map.Entry<String, Integer> o2) {
          return o2.getValue().compareTo(o1.getValue());
        }

      });

      /*for (Map.Entry<String, Integer> entry : list) {

        if (entry.getValue() >= 192) {
          System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Map<Integer, String> reverseMap = new HashMap<>();
        reverseMap.put(entry.getValue(), entry.getKey());
      }*/
    }
    catch (Exception e) {
      System.out.println("Error occured!");
    }
  }
}
