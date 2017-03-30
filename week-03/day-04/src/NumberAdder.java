public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(adding(4));

  }
  public static int adding (int firstNumber){
    if (firstNumber == 1){
      return 1;
    }
    else {
      return firstNumber + adding(firstNumber-1);
    }
  }
}
