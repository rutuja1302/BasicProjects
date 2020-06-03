/* I/P - name, $stake , $goal and no. Of times
   Logic - Play till the gambler is broke or won
   O/P - Print no.of wons & percentage of win or loss */

import java.util.Scanner;
public class Main{
  static String name;           //stores name
  static int stake;             //stores $stake
  static int goal;              //stores $goal
  static int num;               //stores no. of times
  static String yes = "y";       //stores response
  static int wins=0;             //initializing wins counter
  static int bets=0;             //initializing bets counter
  static int cash;               //counter for stake

//method to take and store user details
  public static void enterDetails(){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello " +name+ ", Enter your stake: ");
    stake = input.nextInt();
    System.out.println("Enter your goal: ");
    goal = input.nextInt();
    System.out.println("No.of times to place bet: ");
    num = input.nextInt();
  }

//method to gamble
  public static void gamble(){
    for(int i=0 ; i<num ; i++){
      cash = stake;
      while(cash!=0 && cash!=goal){
        if(Math.random() > 0.5){
          cash++;
        }else{
          cash--;
        }
        bets++;
      }
      if(cash == goal){
        wins++;
      }
    }
    
  }

  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    name = input.nextLine();
    enterDetails();
    
    System.out.println(name +", \n Your stake is " +stake+ "$ \n Goal is to reach " +goal+ "$ \n and No. of times to place bet is " +num);
    System.out.println("Should we confirm your bet? [y/n] ");
    String response = input.nextLine();
    
    if(response.equals(Main.yes)){
      gamble();
    }else{
      System.out.println("Please enter your details again! \n");
      enterDetails();
      gamble();
    }
    if(wins!=0){
      System.out.println("WOW! Congratulations!");
      System.out.println("You won: " +wins+ " times!");
      System.out.println("Average bets: " +bets/num);
      System.out.println("Percentage of win: " +((double)wins/(double)num)* 100.0+ "%");
    }else{
      System.out.println("Better luck next time!");
      System.out.println("Average bets: " +bets/num);
      System.out.println("Percentage of win: " +wins+ "%");
    }

  }
}
