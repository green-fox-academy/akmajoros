import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    List<Domino> orderedDominos = new ArrayList<>();
    orderedDominos.add(dominoes.get(0));

    for (int i = 0; i < dominoes.size(); i++) {
      int[] currentDomino = orderedDominos.get(i).getValues();
      for (int j = 1; j < dominoes.size(); j++) {
        int[] nextDomino = dominoes.get(j).getValues();
        if (currentDomino[1] == nextDomino[0]) {
          orderedDominos.add(dominoes.get(j));
        }
      }
    }
    System.out.println(orderedDominos);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
