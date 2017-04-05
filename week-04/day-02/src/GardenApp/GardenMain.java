package GardenApp;

import java.util.ArrayList;

public class GardenMain {
  public static void main(String[] args) {
    Garden gardenToWater = new Garden();
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree ("orange");

    gardenToWater.addFlowers(flower1);
    gardenToWater.addFlowers(flower2);
    gardenToWater.addTrees(tree1);
    gardenToWater.addTrees(tree2);

    gardenToWater.gardenState();

    gardenToWater.wateringGarden(40);
    gardenToWater.gardenState();

    gardenToWater.wateringGarden(70);
    gardenToWater.gardenState();
  }
}
