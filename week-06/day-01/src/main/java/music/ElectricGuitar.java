package main.java.music;

public class ElectricGuitar extends StringedInstruments {

  public ElectricGuitar() {
    this.name = "ElectricGuitar";
    this.sound = "Twang";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int x) {
    this.name = "ElectricGuitar";
    this.sound = "Twang";
    this.numberOfStrings = x;
  }
}
