import java.util.ArrayList;
import java.util.List;

public class Car {
  public enum carType {VOLVO, MERCEDES, AUDI, ALFAROMEO};
  public enum carColor {BLACK, SILVER, RED, WHITE};

  public Car (carType type, carColor color) {
  }

  List<Car> listOfCars = new ArrayList<>();

  public void carFiller() {
    for (int i = 0; i < 256; i++) {
      int randomType = (int) Math.random()*4;
      int randomColor = (int) Math.random()*4;
      carType type;
      carColor color;

      for (int j = 0; j < carType.values().length; j++) {
        type = carType.values()[randomType];
      }

      for (int k = 0; k < carColor.values().length; k++) {
        color = carColor.values()[randomColor];
      }

      Car car = new Car(type, color);
    }
  }
}
