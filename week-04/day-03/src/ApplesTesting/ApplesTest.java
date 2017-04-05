package ApplesTesting;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
  @Test
  public void getApple(){
    Apples apple1 = new Apples("green apple");
    assertEquals("apple", apple1.getApple());
  }
}