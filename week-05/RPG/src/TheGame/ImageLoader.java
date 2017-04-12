package TheGame;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

  private static ImageLoader instance;

  public BufferedImage FLOOR;
  public BufferedImage WALL;
  public BufferedImage HERO_UP;
  public BufferedImage HERO_DOWN;
  public BufferedImage HERO_LEFT;
  public BufferedImage HERO_RIGHT;
  public BufferedImage SKELETON;

  private ImageLoader() {
    try {
      FLOOR = ImageIO.read(new File("src/assets/floor.png"));
      WALL = ImageIO.read(new File("src/assets/wall.png"));
      HERO_UP = ImageIO.read(new File("src/assets/hero-up.png"));
      HERO_DOWN = ImageIO.read(new File("src/assets/hero-down.png"));
      HERO_LEFT = ImageIO.read(new File("src/assets/hero-left.png"));
      HERO_RIGHT = ImageIO.read(new File("src/assets/hero-right.png"));
      SKELETON = ImageIO.read(new File("src/assets/skeleton.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static ImageLoader getInstance() {
    if (instance == null) {
      instance = new ImageLoader();
    }
    return  instance;
  }
}
