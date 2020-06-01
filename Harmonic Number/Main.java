/* Logic - H1 = 1
           H2 = H1 + 1/2
           H3 = H2 + 1/3
         
           Hn = Hn-1 + 1/n */

import java.util.Scanner;
public class Main{
  public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter N: ");
    int num = input.nextInt();
    if(num != 0){
      double hp = 0;  //intialising Hn-1
      for(double i=1 ; i<=num ; i++){
        double hn = hp + 1/i;   //formula for Hn
        hp = hn;
      }
      System.out.println("Harmonic value for " +num+ "is: \n");
      System.out.println(hp);
    }else{
      throw new ArithmeticException("Invalid number");
    }

  }
}
