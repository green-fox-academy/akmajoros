package TheGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.server.Skeleton;
import java.util.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {
  final static int canvasSize = 720;
  final static int tileSize = 72;
  final static int columns = 10;
  final static int rows = 10;
  Area area;
  Hero hero;
  Monster skeleton;
  List<Monster> skeletonList;


  public Board() {
    area = new Area();
    area.fillFields("src/assets/walls.csv");
    hero = new Hero(0, 0);
    skeletonList = new ArrayList<>();
    skeletonGenerator();

    setPreferredSize(new Dimension(canvasSize, canvasSize));
    setVisible(true);
  }

  public void skeletonGenerator(){
    int monsterNumber = 3 + (int) (Math.random() * 3);
    for (int i = 0; i < monsterNumber; i++){
      int monsterX = (int) (Math.random() * columns);
      int monsterY = (int) (Math.random() * rows);
      while (area.isWall(monsterX, monsterY)){
        monsterX = (int) (Math.random() * columns);
        monsterY = (int) (Math.random() * rows);
      }
      skeleton = new Monster(monsterX * tileSize,
                monsterY * tileSize);
      skeletonList.add(skeleton);
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    area.paintTile(graphics);
    hero.draw(graphics);
    for (Monster character : skeletonList) {
      character.draw(graphics);
    }
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

    if (e.getKeyCode() == KeyEvent.VK_UP && currentPosY >= tileSize && !area.isWall(x, y - 1)) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentPosY < tileSize * 9 && !area.isWall(x, y + 1)) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPosX >= tileSize && !area.isWall(x - 1, y)) {
      hero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPosX < tileSize * 9 && !area.isWall(x + 1, y)) {
      hero.moveRight();
    }
    repaint();
  }
}
