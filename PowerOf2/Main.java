import java.util.Scanner;

public class Main{
  public static void main(String [] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter N: ");
    int pow = scan.nextInt();

    if( pow <= 0 || pow <31){

      System.out.println("Power of 2: ");
      for(int i=0; i<=pow ; i++){
        System.out.println((int)Math.pow(2,i));
      }

    }else{

      System.out.println("Value overflows int value, try again!");

    }
  }
}
