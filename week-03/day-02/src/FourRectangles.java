import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.CYAN);
    graphics.fillRect(25, 25, 100, 100);
    graphics.setColor(Color.DARK_GRAY);
    graphics.fillRect(125, 125, 100, 100);
    graphics.setColor(Color.GREEN);
    graphics.fillRect(225, 225, 80, 80);
    graphics.setColor(Color.BLUE);
    graphics.fillRect(125, 25, 100, 100);


  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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