import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter First Name: ");
    String firstName = scan.next();
    System.out.print("Enter Last Name: ");
    String lastName = scan.next();
    System.out.print("Enter identification number: ");
    int id = scan.nextInt();
    System.out.print("No.of subjects: ");
    int numScores = scan.nextInt();
    System.out.println("Enter your scores one by one");
    int[] testScores = new int[numScores];
    for(int i=0; i<numScores; i++){
     testScores[i] = scan.nextInt();
    }
    scan.close();
    Student s = new Student(firstName,lastName,id,testScores);
    s.printPerson();
    System.out.println("Grade: " +s.calculate());
  }
}
