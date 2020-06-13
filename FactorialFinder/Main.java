/*Factorial finder */

import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int num = scan.nextInt();

    if(num == 0){
        System.out.println("Factorial of 0 is 1");
    }else if(num > 0){
      int result = 1;
      for(int i=num ; i>=1 ; i--){
        result = result * i;
      }
      System.out.println("Factorial of "+num+" is: " +result);
    }else{
      throw new ArithmeticException("Enter a positive number");
    }
  }
}
