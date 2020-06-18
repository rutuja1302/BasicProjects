/*
  HangMan Game
  @author - rutuja1302
*/
import java.util.Scanner;
import java.util.Random;
public class Main{
  public static Scanner scan = new Scanner(System.in);
  public static Random rand = new Random();
  public static String[] word = {"absurd","avenue","jockey","luxury","oxygen","subway","zombie","burger","cookie","donkey","scared","wealth","vessel"};
  public static String guess = "******" , q;
  public static char[] guessArray = guess.toCharArray();
  public static int num, points=0, count=0;
  public static void welcome(){
    System.out.println("......THE HANGING MAN......");
    System.out.println("    WELCOME TO THE GAME    ");
    System.out.println();
    System.out.println("Rules of the game: ");
    System.out.println("1» 6 letterd word will be given to you.");
    System.out.println("2» You have total 6 tries to guess the word right!");
    System.out.println("3» With each correct guess computer fills in the spaces & you earn points");
    System.out.println("4» If you guess the word right, YOU WIN! Else the COMPUTER WINS!");
    System.out.println();
    System.out.println("......Let's Begin......");
  }
  public static void count(){
    if(count == 6){
      System.out.println("GAME OVER! COMPUTER WON :(");
      System.out.println("The word was: " +q);
      System.out.println("   _______");
      System.out.println("  |      _|_");
      System.out.println("  |     /   \\");
      System.out.println("  |     |   |");
      System.out.println("  |     \\_ _/");
      System.out.println("  |      _|_ ");
      System.out.println("  |     / | \\");
      System.out.println("  |      / \\");
      System.out.println("  |     /   \\");
      System.out.println("__|__");
    }
    if(count == 5){
      System.out.println("Wrong guess! try again!");
      System.out.println("  _______");
      System.out.println("  |      _|_");
      System.out.println("  |     /   \\");
      System.out.println("  |     |   |");
      System.out.println("  |     \\_ _/");
      System.out.println("  |      _|_");
      System.out.println("  |     / | \\");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("__|__");
    }
    if(count == 4){
      System.out.println("Wrong guess! try again!");
      System.out.println("   _______");
      System.out.println("  |      _|_");
      System.out.println("  |     /   \\");
      System.out.println("  |     |   |");
      System.out.println("  |     \\_ _/");
      System.out.println("  |       |");
      System.out.println("  |       |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("__|__");
    }
    if(count == 3){
      System.out.println("Wrong guess! try again!");
      System.out.println("   _______");
      System.out.println("  |      _|_");
      System.out.println("  |     /   \\");
      System.out.println("  |     |   |");
      System.out.println("  |     \\_ _/");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("__|__");
    }
    if(count == 2){
      System.out.println("Wrong guess! try again!");
      System.out.println("   _______");
      System.out.println("  |       |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("__|__");
    }
    if(count == 1){
      System.out.println("Wrong guess! try again!");
      System.out.println();
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("  |");
      System.out.println("__|__");
    }
  }
  public static void main(String [] args){
    welcome();
    System.out.println("Guess the word: " +guess);
    num = rand.nextInt(word.length - 1) + 1;
    q = word[num];
    for( int i=0; i<6; i++){
      System.out.print("Enter a letter: ");
      String letter = scan.next();
      if(q.contains(letter)){
        points = points+10;
        int index = q.indexOf(letter);
        guessArray[index] = letter.charAt(0);
        System.out.print("You guessed it right! Now your word becomes: ");
        System.out.println(guessArray);
        System.out.println("Your points » " +points);
      }else{
        count++;
        count();
      }
    }
    if(points == 60){
      System.out.println("Congratulations! You Won!");
    }else if(count < 6){
      System.out.println("Oops! Time's out!");
    }
  }
}
