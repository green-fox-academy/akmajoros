public class UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    String correctEnd = "odds";
    int indexOfB = url.indexOf("b");
    int indexMissing = url.indexOf("/");
    url = url.substring(0, indexMissing) + ":" + url.substring(indexMissing, indexOfB) + correctEnd;

    System.out.println(url);
  }
}

