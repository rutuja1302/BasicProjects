
//Change return program in indian rupees using only if-else statements

import java.util.Scanner;
public class Change{
  public static void main(String [] args){

    Scanner scan = new Scanner(System.in);
  
    System.out.print("Enter cost(in ₹): ");
    int cost = scan.nextInt();
    System.out.print("Amout given(in ₹): ");
    int amt = scan.nextInt();
    int diff = amt - cost;
    System.out.println("Change to be given: " +diff+ "₹");
    System.out.println();
    
    if(diff%2000 == 0){
      System.out.println("Number of 2000₹ notes: " +diff/2000);
    }else if(diff%500 ==0){
      System.out.println("Number of 500₹ notes: " +diff/500);
    }else if(diff%200 == 0){
      System.out.println("Number of 200₹ notes: " +diff/200);
    }else if(diff%100 == 0){
      System.out.println("Number of 100₹ notes: " +diff/100);
    }else if(diff%50 == 0){
      System.out.println("Number of 50₹ notes: " +diff/50);
    }else if(diff%20 == 0){
      System.out.println("Number of 20₹ notes: " +diff/20);
    }else if(diff%10 == 0){
      System.out.println("Number of 10₹ notes: " +diff/10);
    }else if(diff%5 ==0){
      System.out.println("Number of 5₹ coins: " +diff/5);
    }else if(diff%2 == 0){
      System.out.println("Number of 2₹ coins: " +diff/2);
    }else{
      System.out.println("Number of 1₹ coins: " +diff);
    }
  }
}
