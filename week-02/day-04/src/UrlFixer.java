public class UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    String correctEnd = "odds";
    int indexOfB = url.indexOf("b");
    int indexMissing = url.indexOf("/");
    url = url.substring(0, indexMissing) + ":" + url.substring(indexMissing, indexOfB) + correctEnd;

  // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
  // Also, the URL is missing a crutial component, find out what it is and insert it too!
  // Try to solve it more than once using different String functions!

    System.out.println(url);
  }
}

