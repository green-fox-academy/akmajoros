package main.java.music;

public abstract class StringedInstruments extends Instrument {
  String sound;
  String name;
  int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
