package main.java.music;

public class BassGuitar extends StringedInstruments {
  public BassGuitar() {
    this.name = "BassGuitar";
    this.sound = "Duum-duum-duum";
    this.numberOfStrings = 4;

  }

  public BassGuitar(int x) {
    this.name = "BassGuitar";
    this.sound = "Duum-duum-duum";
    this.numberOfStrings = x;
  }
}
