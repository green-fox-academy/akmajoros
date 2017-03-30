public class Counter {
  public static void main(String[] args) {
    count(10);
  }
public static int count (int first) {
    if (first==0){
      return 0;
    }
    else {
      System.out.println(first);
      return first + count(--first);
    }
  }
}