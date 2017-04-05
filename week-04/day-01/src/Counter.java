public class Counter {

  int counter = 0;
  int number;

  public Counter() {
  }

  public Counter(int count) {
    this.counter = count;
    number = count;
  }

  public void add(int number){
    this.counter += number;
  }

  public void add(){
    counter++;
  }

  public int get(){
    return this.counter;
  }

  public void reset(){
    this.counter = number;
  }

}
