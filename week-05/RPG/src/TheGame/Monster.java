package TheGame;

import java.awt.*;

public class Monster extends GameObject {

  public Monster (int posX, int posY ){
    super(ImageLoader.getInstance().SKELETON, posX, posY);
  }
}
