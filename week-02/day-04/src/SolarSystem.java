import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem{
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
    int indexSaturn = planetList.indexOf("Uranus");
    planetList.add(indexSaturn, "Saturn");

    // Saturn is missing from the planetList
    // Insert it into the correct position

    System.out.println(planetList);
  }
}