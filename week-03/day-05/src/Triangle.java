import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  static int canvasSize = 300;

  public static void mainDraw (Graphics graphics){

    triangle(6, 0, 0, 300, graphics);
  }

  public static void triangle(int depth, int x, int y, int size, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    int xpoints[] = {x, x+size/2, x+size};
    int ypoints[] = {y, y+size, y};
    int npoints = 3;

    graphics.drawPolygon(xpoints, ypoints, npoints);

    depth--;

    if (depth>0) {
      triangle(depth, x, y, size/2, graphics);
      triangle(depth, x +size/4, y+size/2, size/2, graphics);
      triangle(depth, x+size/2, y, size/2, graphics);
      }

  }

    public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(323, 340));
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
