package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plants> myGarden = new ArrayList<>();

  public void addFlowers(Flower flower) {
    myGarden.add(flower);
  }

  public void addTrees (Tree tree) {
    myGarden.add(tree);
  }

  public void gardenState() {
    for (int i = 0; i < myGarden.size(); i++){
      if (myGarden.get(i).isWaterNeeded) {
        System.out.println("The " + myGarden.get(i).color + " " + myGarden.get(i).type + " needs water");
      } else {
        System.out.println("The " + myGarden.get(i).color + " " + myGarden.get(i).type + " doesn't need water");
      }
    }
    System.out.println();
  }

  public void wateringGarden(int waterAmount) {
    int howManyToWater = 0;

    for (int i = 0; i < myGarden.size(); i++) {
      if (myGarden.get(i).isWaterNeeded) {
        howManyToWater++;
      }
    }

    for (int i = 0; i < myGarden.size(); i++){
      if (myGarden.get(i).isWaterNeeded) {
        myGarden.get(i).hasWater += ((waterAmount / howManyToWater) * myGarden.get(i).waterConsumption);
      }
    }
  }

}
