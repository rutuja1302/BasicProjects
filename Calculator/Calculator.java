/*Basic 2D Calculator :)
  Performs operations such as add, subtract, multiply, divide,
  exponent, inverse, squaring,square root, percentage and log*/
import java.util.Scanner;
public class Main{
  public static Scanner scan = new Scanner(System.in);
  public static String choice, logBase;
  public static double num1,num2,res,base,pow,exp;
  public static void intro(){
    System.out.println("<==============+Calculator+==============>");
    System.out.println("|                                        |");
    System.out.println("|            Basic Calculator            |");
    System.out.println("|  Performs basic mathematical functions |");
    System.out.println("|   Add, subtract, divide and multiply.  |");
    System.out.println("|Exponents, inverse, squaring, squareroot|");
    System.out.println("|          Percentage & Logarithm        |");
    System.out.println("<========================================>");
    
  }
  public static void add(){
    System.out.print("Enter 1st number: ");
    num1 = scan.nextDouble();
    System.out.print("Enter 2nd number: ");
    num2 = scan.nextDouble();
    res = num1 + num2;
    System.out.println("Result: " +res);
  }
  public static void subtract(){
    System.out.print("Enter 1st number: ");
    num1 = scan.nextDouble();
    System.out.print("Enter 2nd number: ");
    num2 = scan.nextDouble();
    res = num1 - num2;
    System.out.println("Result: " +res);
    
  }
  public static void divide(){
    System.out.print("Enter 1st number: ");
    num1 = scan.nextDouble();
    System.out.print("Enter 2nd number: ");
    num2 = scan.nextDouble();
    res = num1/num2;
    System.out.println("Result: " +res);
  }
  public static void multiply(){
    System.out.print("Enter 1st number: ");
    num1 = scan.nextDouble();
    System.out.print("Enter 2nd number: ");
    num2 = scan.nextDouble();
    res = num1 * num2;
    System.out.println("Result: " +res);
  }
  public static void exponent(){
    System.out.print("Enter base: ");
    base = scan.nextInt();
    System.out.print("Enter power: ");
    pow = scan.nextInt();
    exp = Math.pow(base,pow);
    System.out.println("Result: " +exp);
  }
  public static void inverse(){
    System.out.print("Enter a number: ");
    num1 = scan.nextDouble();
    res = 1/num1;
    System.out.println("Result: " +res);
  }
  public static void square(){
    System.out.print("Enter a number: ");
    num1 = scan.nextInt();
    System.out.println("Result: " +Math.pow(num1,2));
  }
  public static void squareroot(){
    System.out.print("Enter a number: ");
    num1 = scan.nextDouble();
    res = Math.sqrt(num1);
    System.out.println("Result: " +res);
  }
  public static void percent(){
    System.out.print("Enter a number: ");
    num1 = scan.nextDouble();
    res = num1/100;
    System.out.println("Result: " +res+ "%");
  }
  public static void log(){
    System.out.print("Enter a number" );
    num1 = scan.nextDouble();
    System.out.print("Choose Base [E/10]: ");
    logBase = scan.next();
    if(logBase.equals("E")){
      System.out.println("Result: " +Math.log(num1));
    }else{
      System.out.println("Result: " +Math.log10(num1));
    }
  }
  public static void main(String[] args){
    intro();
    System.out.println();
    System.out.print("Enter your choice: ");
    choice = scan.nextLine().toUpperCase();
    if(choice.equals("ADD")){
      add();
    }else if(choice.equals("SUBTRACT") || choice.equals("SUB")){
      subtract();
    }else if(choice.equals("DIVIDE") || choice.equals("DIV")){
      divide();
    }else if(choice.equals("MULTIPLY") || choice.equals("MUL")){
      multiply();
    }else if(choice.equals("EXPONENTS") || choice.equals("EXPONENT") || choice.equals("EXP")){
      exponent();
    }else if(choice.equals("INVERSE") || choice.equals("INV")){
      inverse();
    }else if(choice.equals("SQUARE")){
      square();
    }else if(choice.equals("SQUARE ROOT") || choice.equals("SQRT")){
      squareroot();
    }else if(choice.equals("PERCENTAGE") || choice.equals("PERCENT")){
      percent();
    }else if(choice.equals("LOGARITHM") || choice.equals("LOG")){
      log();
    }else{
      System.out.println("Please be more specific");
    }
  }
}
