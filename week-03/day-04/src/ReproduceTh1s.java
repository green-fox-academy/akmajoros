import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReproduceTh1s {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0, 0, 600, 600);
    drawSquares(graphics);

  }

  public static void drawSquares (Graphics graphics) {
    int canvasSize = 600;
    graphics.setColor(Color.BLACK);
    graphics.drawLine(canvasSize/3, 0, canvasSize/3, 600);
    graphics.drawLine(canvasSize/3*2, 0, canvasSize/3*2, 600);
    graphics.drawLine(0, canvasSize/3, 600, canvasSize/3);
    graphics.drawLine(0, canvasSize/3*2, 600, canvasSize/3*2);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
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
