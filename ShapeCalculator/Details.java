import java.util.Scanner;
class Details extends Shape{
  Scanner obj = new Scanner(System.in);
  
  //body for abstract method circle provided here
  public void circle(){
    System.out.println("Enter radius: ");
    double radius = obj.nextDouble();
    double area = Math.PI * Math.pow(radius,2);
    System.out.println("Area of circle: " +area+ "cm²");
    double perimeter = 2 * Math.PI * radius;
    System.out.println("Perimeter of circle: " +perimeter+ "cm");
  }

  //body for abstract method rectangle provided here
  public void rectangle(){
    System.out.println("Enter length: ");
    double length = obj.nextDouble();
    System.out.println("Enter width: ");
    double width = obj.nextDouble();
    double area = length * width;
    System.out.println("Area of rectangle: " +area+ "cm²");
    double perimeter = 2*(length + width);
    System.out.println("Perimeter of rectangle: " +perimeter+ "cm");
  }

  //body for abstract method square provided here
  public void square(){
    System.out.println("Enter length: ");
    double length = obj.nextDouble();
    double area = Math.pow(length,2);
    System.out.println("Area of square: " +area+ "cm²");
    double perimeter = 4 * length;
    System.out.println("Perimeter of square: " +perimeter+ "cm");
  }

  //body for abstract method triangle provided here
  public void triangle(){
    System.out.println("To calculate area of triangle..");
    System.out.println("Enter breadth: ");
    double breadth = obj.nextDouble();
    System.out.println("Enter height: ");
    double height = obj.nextDouble();
    double area = 0.5 * breadth * height;
    System.out.println("Area of triangle: " +area+ "cm²");
    System.out.println("\n To calculate perimeter of triangle..");
    System.out.println("Enter length of side a: ");
    double a = obj.nextDouble(); 
    System.out.println("Enter length of side b: ");
    double b = obj.nextDouble();
    System.out.println("Enter length of side c: ");
    double c = obj.nextDouble();
    double perimeter = a + b + c;
    System.out.println("Perimeter of circle: " +perimeter+ "cm");
  }
}
