import java.util.Scanner;

public class String{
  public static void main(String [] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = input.nextLine();
    char [] array = str.toCharArray();

    for(int i = array.length-1 ; i >= 0 ; i--){

      System.out.println(array[i]);

    }
  }
}
