package TheGame;

import java.awt.*;

public class Tile extends Board {
  void drawTile(Graphics graphics) {
    for (int j = 0; j < 720; j += 72) {
      for (int i = 0; i < 720; i += 72) {
        PositionedImage tile = new PositionedImage("src/assets/floor.png", j, i);
        tile.draw(graphics);
      }
    }
  }
}
