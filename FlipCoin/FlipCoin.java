import java.util.Scanner;

public class FlipCoin{
  public static void main(String [] args) {
    int tail = 0;  //initialising counter
    int head = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int myNum = input.nextInt();
    double copyNum = myNum;  //to calculate percentage
    if(myNum > 0){
      for(int i=myNum ; i>0 ; i--){
        double myVar = Math.random();   //gives random value between 0 to 1
        if(myVar<0.5){
          tail = tail + 1;
        }else{
          head = head + 1;
        }
      }
      double percentTail = (tail/copyNum)*100;
      double percentHead = (head/copyNum)*100;
      System.out.println("Probability of heads: " +percentHead+ "%");
      System.out.println("Probability of tails: " +percentTail+ "%");
    }else{
      System.out.println("Invalid number");
    }

  }
}
