import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3 {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, 300, 300);
    int size = 10;
    int position = 0;

    for ( int i = 0; i < 6; i++) {
      /*graphics.setColor(Color.BLACK);
      graphics.drawRect(i+10, i+10, 10, 10);*/
      graphics.setColor(new Color(138, 43, 226));
      graphics.fillRect(position, position, size, size);
      size += 10;
      position += size-10;
    }
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