//Unit converter 

import java.util.Scanner;
public class Main{
  
  public static final String TEMP = "TEMPERATURE";
  public static final String TEMPC = "CELCIUS";
  public static final String TEMPF = "FAHRENHEIT";
  public static final String TEMPK = "KELVIN";
  public static final String LEN = "LENGTH";
  public static final String LENKM = "KILOMETRE";
  public static final String LENM = "METRE";
  public static final String LENCM = "CENTIMETRE";
  public static final String LENMM = "MILLIMETRE";
  public static final String LENF = "FOOT";
  public static final String LENI = "INCH";
  public static final String MASS = "MASS";
  public static final String MASSMG = "MILLIGRAM";
  public static final String MASSG = "GRAM";
  public static final String MASSKG = "KILOGRAM";
  public static final String MASST = "TONNE";
  public static final String ANG = "ANGLE";
  public static final String DEG = "DEGREE";
  public static final String RAD = "RADIAN";
  
  public static void temperature(){
    Scanner obj = new Scanner(System.in);
    System.out.print("From unit: ");
    String unit1 = obj.nextLine().toUpperCase();
    System.out.print("To unit: ");
    String unit2 = obj.nextLine().toUpperCase();
    System.out.print("Enter value in " +unit1+ ": ");
    double value = obj.nextDouble();
    
    if(unit1.equals(Main.TEMPC) && unit2.equals(Main.TEMPF)){
      double res1 = (value * 9/5) + 32;
      System.out.println("Result: " +res1+ " °F");
    }else if(unit1.equals(Main.TEMPF) && unit2.equals(Main.TEMPC)){
      double res2 = (value - 32) * 5/9;
      System.out.println("Result: " +res2+ " °C");
    }else if(unit1.equals(Main.TEMPC) && unit2.equals(Main.TEMPK)){
      double res3 = value + 273.15;
      System.out.println("Result: " +res3+ " K");
    }else if(unit1.equals(Main.TEMPK) && unit2.equals(Main.TEMPC)){
      double res4 = value - 273.15;
      System.out.println("Result: " +res4+ " °C");
    }else if(unit1.equals(Main.TEMPK) && unit2.equals(Main.TEMPF)){
      double res5 = (value - 273.15) * 9/5 + 32;
      System.out.println("Result: " +res5+ " °F");
    }else if(unit1.equals(Main.TEMPF) && unit2.equals(Main.TEMPK)){
      double res6 = (value - 32) * 5/9 + 273.15;
      System.out.println("Result: " +res6+ " K");
    }else{
      throw new ArithmeticException("Unit not found, try again");
    }
  }
  
  public static void length(){
    Scanner obj = new Scanner(System.in);
    System.out.print("From unit: ");
    String unit1 = obj.nextLine().toUpperCase();
    System.out.print("To unit: ");
    String unit2 = obj.nextLine().toUpperCase();
    System.out.print("Enter value in " +unit1+ ": ");
    double value = obj.nextDouble();
    
    if(unit1.equals(Main.LENKM) && unit2.equals(Main.LENM)){
      double res1 = value * 1000;
      System.out.println("Result: " +res1+ " metre");
    }else if(unit1.equals(Main.LENM) && unit2.equals(Main.LENKM)){
      double res2 = value/1000;
      System.out.println("Result: " +res2+ " Km");
    }else if(unit1.equals(Main.LENCM) && unit2.equals(Main.LENM)){
      double res3 = value/100;
      System.out.println("Result: " +res3+ " metre");
    }else if(unit1.equals(Main.LENMM) && unit2.equals(Main.LENCM)){
      double res4 = value/10;
      System.out.println("Result: " +res4+ " cm");
    }else if(unit1.equals(Main.LENF) && unit2.equals(Main.LENI)){
      double res5 = value * 12;
      System.out.println("Result: " +res5+ " inch");
    }else{
      throw new ArithmeticException("Unit not found, try again");
    }
  }
  
  public static void mass(){
    Scanner obj = new Scanner(System.in);
    System.out.print("From unit: ");
    String unit1 = obj.nextLine().toUpperCase();
    System.out.print("To unit: ");
    String unit2 = obj.nextLine().toUpperCase();
    System.out.print("Enter value: ");
    double value = obj.nextDouble();
    double res1 = value/1000;
    if(unit1.equals(Main.MASSMG) && unit2.equals(Main.MASSG)){
     System.out.println("Result: " +res1+ " gram");
    }else if(unit1.equals(Main.MASSG) && unit2.equals(Main.MASSKG)){
      System.out.println("Result: " +res1+ " Kg");
    }else if(unit1.equals(Main.MASSKG) && unit2.equals(Main.MASST)){
      System.out.println("Result: " +res1+ " tonne");
    }else if(unit1.equals(Main.MASSKG) && unit2.equals(Main.MASSG)){
      double res2 = value * 1000;
      System.out.println("Result: " +res2+ " gram");
    }else{
      throw new ArithmeticException("Unit not found, try again");
    }
  }
  
  public static void angle(){
    double pi = Math.PI;
    Scanner obj = new Scanner(System.in);
    System.out.print("From unit: ");
    String unit1 = obj.nextLine().toUpperCase();
    System.out.print("To unit: ");
    String unit2 = obj.nextLine().toUpperCase();
    System.out.print("Enter value in " +unit1+ ": ");
    double value = obj.nextDouble();
    
    if(unit1.equals(Main.DEG) && unit2.equals(Main.RAD)){
      double res1 = value * pi/180;
      System.out.println("Result: " +res1+ " Rad");
    }else if(unit1.equals(Main.RAD) && unit2.equals(Main.DEG)){
      double res2 = value * 180/pi;
      System.out.println("Result: " +res2+ "°");
    }else{
      throw new ArithmeticException("Unit not found, try again");
    }
  }
  public static void main(String [] args){
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter type of unit: ");
    String type = obj.nextLine().toUpperCase();
    
    if(type.equals(Main.TEMP)){
      temperature();
    }else if(type.equals(Main.LEN)){
      length();
    }else if(type.equals(Main.MASS)){
      mass();
    }else if(type.equals(Main.ANG)){
      angle();
    }else{
      throw new ArithmeticException("Type of unit not found, try again");
    }
    
  }
}
