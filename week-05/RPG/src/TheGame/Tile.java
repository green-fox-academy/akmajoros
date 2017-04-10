package TheGame;

import java.awt.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class Tile extends Board {
  int tileSize;
  String[][] wallsAll = new String[10][10];
  Path filePath;

  void drawWall(String pathStuff) {

    this.filePath = Paths.get(pathStuff);
    try {
      List<String> walls = Files.readAllLines(filePath);
      for (int i = 0; i < walls.size(); i++) {
        String[] row = walls.get(i).split(";");
        wallsAll[i] = row;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  boolean isWall (int x, int y) {
    if (wallsAll[x][y].equals("1")){
      return true;
    } else {
      return false;
    }
  }

  void drawTiles(Graphics graphics) {
    tileSize = 72;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (!isWall(i, j)){
          PositionedImage tile = new PositionedImage("src/assets/floor.png", j * tileSize, i * tileSize);
          tile.draw(graphics);
        } else {
          PositionedImage tile = new PositionedImage("src/assets/wall.png", j * tileSize, i * tileSize);
          tile.draw(graphics);
        }
      }
    }
  }

}
