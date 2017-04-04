package GreenFox;

public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hello, I am " + name + ", a " + age + " year old " + gender + " from "
            + previousOrganization + " who skipped " + skippedDays + " days already.");
  }

  /*@Override
  public void introduce() {
    super.introduce();
  }*/

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
}
