package SumTesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
  @Test
  public void sumMethod2(){
    ArrayList<Integer> toAdd = new ArrayList<>();
    Sum sum2 = new Sum();
    toAdd.add(45);
    toAdd.add(20);
    assertEquals(64, sum2.sumMethod(toAdd));
  }

  @Test
  public void emptyList(){
    ArrayList<Integer> toAdd = new ArrayList<>();
    Sum sum2 = new Sum();
    assertEquals(0, sum2.sumMethod(toAdd));
  }

  @Test
  public void oneElement(){
    ArrayList<Integer> toAdd = new ArrayList<>();
    Sum sum2 = new Sum();
    toAdd.add(38);
    assertEquals(38, sum2.sumMethod(toAdd));
  }

  @Test
  public void multipleElement(){
    ArrayList<Integer> toAdd = new ArrayList<>();
    Sum sum2 = new Sum();
    toAdd.add(38);
    toAdd.add(10);
    toAdd.add(30);
    assertEquals(78, sum2.sumMethod(toAdd));
  }

  @Test
  public void nullTest(){
    ArrayList<Integer> toAdd = null;
    Sum sum2 = new Sum();
    assertEquals(0, sum2.sumMethod(toAdd));
  }


}