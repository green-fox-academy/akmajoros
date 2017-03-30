import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Power {
  public static void main(String[] args) {
    System.out.println(powerfunction(10, 6));
  }
  public static int powerfunction (int base, int power) {
    if (power == 1) {
      return base;
    }
    else {
      return base * powerfunction(base, power-1);
    }
  }
}
