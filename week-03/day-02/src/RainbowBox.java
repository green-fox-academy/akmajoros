import javax.swing.*;

import java.awt.*;

import static java.lang.Math.random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {

  public static void mainDraw(Graphics graphics){
    drawingRainbows(300, 16777215, graphics);

  }

  public static void drawingRainbows ( int size, int col, Graphics graphics) {
    int maxSize = 300;
    int rgb = 0;
    int random = (int) (Math.random() * 16777215);
    while (maxSize > 0){
      graphics.setColor( new Color (rgb));
      graphics.fillRect(150-maxSize/2, 150-maxSize/2, maxSize, maxSize);
      maxSize -= 10;
      rgb = (int) (Math.random() * 16777215);
    }
    graphics.setColor( new Color(col));
    graphics.fillRect(150-size/2, 150-size/2, size, size);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}