package TheGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int canvasSize = 720;
  int tileSize = 71;
  Tile tile;
  int monsterX = (int) Math.random() * 10;
  int monsterY = (int) Math.random() * 10;
  Hero hero = new Hero(0, 0);
  Monster skeleton = new Monster(monsterX * tileSize, monsterY * tileSize);


  public Board() {
    setPreferredSize(new Dimension(canvasSize, canvasSize));
    setVisible(true);
  }

  public void monsterGenerator (Graphics graphics){
    for (int i = 0; i <= skeleton.skeletonNumber; i++){
      skeleton.draw(graphics);
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    tile = new Tile();
    tile.fillFields("src/assets/walls.csv");
    tile.paintTile(graphics);
    hero.draw(graphics);
    skeleton.draw(graphics);
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
