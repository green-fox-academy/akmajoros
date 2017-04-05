package SumTesting;

import java.util.ArrayList;

public class Sum {

  public int sumMethod (ArrayList<Integer> toAdd) {
    int sum = 0;
    if (toAdd == null) {
      return 0;
    } else {
      for (int i = 0; i < toAdd.size(); i++) {
        sum += toAdd.get(i);
      }
      return sum;
    }
  }
}
