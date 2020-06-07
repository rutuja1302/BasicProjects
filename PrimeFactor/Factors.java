import java.util.Scanner;
import java.util.ArrayList;

public class Main{

  static int num;
  static int count = 0;
  static int i=1;
  
  public static void checkNum(){
    ArrayList<Integer> list = new ArrayList<Integer>();  //it will store all the factors 
    while(i<=num){
      if(num%i == 0){
        count++;
        list.add(i);
      }
      
      i++;
      
    }
    if(count <= 2){
      System.out.println(num+ " is a Prime Number");
      System.out.println("There are " +count+ " factors: ");
      System.out.println(list);
    }else{
      System.out.println(num+ " is a Composite Number");
      System.out.println("There are " +count+ " factors: ");
      System.out.println(list);
    }
  }

  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input any positive integer number larger than 1: ");
    num = scan.nextInt();
    if(num > 1){
      checkNum();
    }else{
      System.out.println("Enter valid number");
    }
  }
  
}
