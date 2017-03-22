public class Matrix {
  public static void main(String[] args) {
    int[][] a;
    a = new int[4][4];

    for (int i = 0; i <a.length; i++) {
      for (int j = 0; j <a[i].length; j++){
        if (i == j){
          a[i][j] = 1;
        }
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }
  }
}


