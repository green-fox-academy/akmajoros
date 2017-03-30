public class StringAgainAndAgain {
  public static void main(String[] argc) {
    System.out.println(putStar("blablaxbcxdexfg"));
  }

  private static String putStar(String text) {
    if (text.length() <= 1) {
      return text;
    } else {
      return text.charAt(0) + "*" + putStar(text.substring(1));
    }
  }
}