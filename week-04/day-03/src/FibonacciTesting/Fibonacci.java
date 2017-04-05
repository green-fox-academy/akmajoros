package FibonacciTesting;

public class Fibonacci {
  public static int fibonacciChecker(int  n) {
    if (n < 0) {
      return -1;
    }
    if ((n == 1) || (n == 0)) {
      return n;
    }
    return fibonacciChecker(n - 1) + fibonacciChecker(n - 2);
  }
}
