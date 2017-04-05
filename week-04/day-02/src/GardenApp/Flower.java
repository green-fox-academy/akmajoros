package GardenApp;

public class Flower extends Plants{
  public Flower (String color) {
    this.type = "flower";
    this.color = color;
    this.hasWater = 0;
    this.waterConsumption = 0.75;
    this.isWaterNeeded = (hasWater < 5);
  }
}
