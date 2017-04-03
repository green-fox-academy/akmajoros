public class Animals {
  int hunger;
  int thirst;

  public Animals(){
    hunger = 50;
    thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst--;
  }
}
