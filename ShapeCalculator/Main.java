/* this class will take TYPE OF SHAPE 
   as an input and give "area & peimeter"
   as output or will throw an exception if
   shape not present */

import java.util.Scanner;
public class Main{
  public static final String CIRCLE = "CIRCLE";
  public static final String RECTANGLE = "RECTANGLE";
  public static final String SQUARE = "SQUARE";
  public static final String TRIANGLE ="TRIANGLE";
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    Details obj = new Details();
    System.out.println("SHAPE CALCULATOR \n");
    System.out.println("Enter a shape: ");
    String a = input.nextLine();
    String shape = a.toUpperCase();
    
    if(shape.equals(Main.CIRCLE)){
      obj.circle();
    }else if(shape.equals(Main.RECTANGLE)){
      obj.rectangle();
    }else if(shape.equals(Main.SQUARE)){
      obj.square();
    }else if(shape.equals(Main.TRIANGLE)){
      obj.triangle();
    }else{
      throw new ArithmeticException("Shape not found, try again later!");
    }
  }
}
