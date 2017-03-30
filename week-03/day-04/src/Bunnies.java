public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnyears(4));
  }
  public static int bunnyears (int bunnies) {
    if (bunnies == 1) {
      return 2;
    }
    else {
      return 2 + bunnyears(bunnies-1);
    }
  }
}
