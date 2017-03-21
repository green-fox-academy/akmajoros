/**
 * Created by HorvathGy on 2017.03.21..
 */
public class cuboid {
    public static void main(String[] args) {
        double aSide = 12.56;
        double bSide = 25.79;
        double cSide = 33.95;
        double surface = ( 2 * (aSide * bSide)) + ( 2 * (aSide * cSide)) + ( 2 * (bSide * cSide));
        double volume = aSide * bSide * cSide;
        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
