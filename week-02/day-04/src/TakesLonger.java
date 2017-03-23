public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String missingPart = "always takes longer than";
    int startMissing = quote.indexOf("t",8);
    int afterMissing = quote.indexOf("y");
    quote = quote.substring(0, startMissing) + " " + missingPart + " " + quote.substring(afterMissing);

    System.out.println(quote);
  }
}
