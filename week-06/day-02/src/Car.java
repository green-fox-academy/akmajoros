import java.util.ArrayList;
import java.util.List;

public class Car {
  public enum carType {VOLVO, MERCEDES, AUDI, ALFAROMEO};
  public enum carColor {BLACK, SILVER, RED, WHITE};

  carType type;
  carColor color;

  public Car {
    int randomType = (int)(Math.random() * carType.values().length);
    int randomColor = (int)(Math.random() * carColor.values().length);
    type = carType.values()[randomType;
    color = carColor.values()[randomColor];
  }

  List<Car> listOfCars = new ArrayList<>();

  public static void main(String[] args) {
  }
}
