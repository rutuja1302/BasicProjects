import java.util.Scanner;

public class PrintName{
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = input.nextLine();
    if(name.length() > 3){
      System.out.println("Hello " +name+ ", How are you?");
    }else{
      System.out.println("Invalid name");
    }
  }
}
