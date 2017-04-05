package GardenApp;

public class Tree extends Plants {
  public Tree (String color) {
    this.type = "tree";
    this.color = color;
    this.waterConsumption = 0.4;
    this.hasWater = 0;
    this.isWaterNeeded = (hasWater < 10);

  }
}
