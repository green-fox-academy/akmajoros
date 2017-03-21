public class ConditionalVariableMutation {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    boolean aIsEven = (a % 2 == 0);
    if (aIsEven) {
      out += 1;
    }
    System.out.println(out);


    int b = 13;
    String out2 = "";
    boolean Sweet = (b > 10) && (b < 20);
    boolean More = (b < 10);
    boolean Less = (b > 20);
    if (Sweet) {
      out2 += "Sweet!";
    } else if (More) {
      out2 += "More";
    } else if (Less) {
      out2 += "Less!";
    }
    System.out.println(out2);


    int c = 123;
    int credits = 100;
    boolean isBonus = false;
    if (credits >= 50 && isBonus == false) {
      c -= 2;
    } else if (credits < 50 && isBonus == false) {
      c -= 1;
    } else if (isBonus == true) {
      c += 0;
    }
    System.out.println(c);


    int d = 8;
    int time = 120;
    String out3 = "";
    if (d % 4 == 0 && time <= 200) {
      out3 += "check";
    } else if (time > 200) {
      out3 += "Time out";
    } else {
      out3 += "Run Forest Run!";
    }
    System.out.println(out3);
  }
}
