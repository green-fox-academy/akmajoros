package SumTesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
  @Test
  public void sumMethod(){
    ArrayList<Integer> toAdd = new ArrayList<>();
    toAdd.add(45);
    toAdd.add(20);
    Sum sum2 = new Sum();
    assertEquals(64, sum2.sumMethod(toAdd));
  }

  
}