package TheGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int canvasSize = 720;
  int tileSize = 71;
  int heroStartX = 0;
  int heroStartY = 0;

  public Board() {
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    PositionedImage image = new PositionedImage("src/assets/hero-down.png", heroStartX, heroStartY);
    Tile tile = new Tile();
    tile.drawTile(graphics);
    image.draw(graphics);
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      heroStartY -= tileSize;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      heroStartY += tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      heroStartX -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      heroStartX += tileSize;
    }
    invalidate();
    repaint();
  }
}
