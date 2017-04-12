package TheGame;

import java.awt.*;

public class Monster extends GameObject {
  int skeletonNumber;

  public Monster (int posX, int posY ){
    super(ImageLoader.getInstance().SKELETON, posX, posY);
    this.skeletonNumber = 3 + (int) Math.random() * 3;
  }
}
