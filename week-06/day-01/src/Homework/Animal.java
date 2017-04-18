package Homework;

public abstract class Animal {
  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  String name;
  int age;
  String gender;
  abstract void eat();
  abstract void sleep();
  abstract void greet();
  abstract String wantChild();
}
