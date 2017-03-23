public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    String todoGames = " - Download games\n";
    String gameDiablo = " - Diablo";
    String myTodo = "My todo:\n";
    //int startMilk = todoText.indexOf("-");
    todoText = myTodo + todoText + todoGames + "\t" + gameDiablo;

    System.out.println(todoText);
  }
}
