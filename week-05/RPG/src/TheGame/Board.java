package TheGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  final static int canvasSize = 720;
  final static int tileSize = 71;
  Area area;
  Hero hero = new Hero(0, 0);
  Monster skeleton;


  public Board() {
    setPreferredSize(new Dimension(canvasSize, canvasSize));
    setVisible(true);
  }

  public void skeletonDrawer(){
    int monsterNumber = 3 + (int) Math.random() * 3;
    for (int i = 0; i < monsterNumber; i++){
      int monsterX = (int) Math.random() * 10;
      int monsterY = (int) Math.random() * 10;
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    tile = new Tile();
    tile.fillFields("src/assets/walls.csv");
    tile.paintTile(graphics);
    hero.draw(graphics);
  }

  public static void main(String[] args) {
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
    int currentPosX = hero.posX;
    int currentPosY = hero.posY;
    int x = currentPosX / tileSize;
    int y = currentPosY / tileSize;

    if (e.getKeyCode() == KeyEvent.VK_UP && currentPosY >= tileSize && !tile.isWall(x, y - 1)) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentPosY < tileSize * 9 && !tile.isWall(x, y + 1)) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPosX >= tileSize && !tile.isWall(x - 1, y)) {
      hero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPosX < tileSize * 9 && !tile.isWall(x + 1, y)) {
      hero.moveRight();
    }
    repaint();
  }
}
