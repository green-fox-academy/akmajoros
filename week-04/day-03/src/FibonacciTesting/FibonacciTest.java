package FibonacciTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  Fibonacci fibonacci = new Fibonacci();
  int whichElement;
  int elementValue;

  @Test
  public void testFor1() {
    whichElement = 1;
    elementValue = 1;
    assertEquals(elementValue, fibonacci.fibonacciChecker(whichElement));
  }

  @Test
  public void testFor0() {
    whichElement = 0;
    elementValue = 0;
    assertEquals(elementValue, fibonacci.fibonacciChecker(whichElement));
  }

  @Test
  public void testForLarger() {
    whichElement = 7;
    elementValue = 13;
    assertEquals(elementValue, fibonacci.fibonacciChecker(whichElement));
  }

  @Test
  public void testForNegative() {
    whichElement = -2;
    elementValue = -1;
    assertEquals(elementValue, fibonacci.fibonacciChecker(whichElement));
  }
}