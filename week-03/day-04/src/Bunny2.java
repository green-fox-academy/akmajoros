public class Bunny2 {
  public static void main(String[] args) {
    System.out.println(bunnyears(10));
  }
  public static int bunnyears (int bunnies){
    int sum = 0;
    if (bunnies == 0) {
      return 0;
    }
    else {
      if (bunnies % 2 == 0) {
        sum = 2 + bunnyears(bunnies - 1);
      }
      else  {
        sum = 3 + bunnyears(bunnies -1);
      }
      return sum;
    }
  }
}
