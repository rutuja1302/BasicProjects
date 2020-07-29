//Employee's Salary Calculator
import java.util.Scanner;
public class Main{
  public static int salaryCalculator(int hoursPerWeek, int amountPerHour, int vacDays){
    if(hoursPerWeek < 0){
      return -1;
    }
    if(amountPerHour < 0){
      return -1;
    }
    int weeklyPayCheck = hoursPerWeek * amountPerHour;
    int unpaidCheck = vacDays*amountPerHour*8;
    return (weeklyPayCheck*52)-unpaidCheck;
  }
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of hours the employee works per week: ");
    int hours = input.nextInt();
    System.out.print("Amount of money the employee makes per hour: ");
    int amt = input.nextInt();
    System.out.print("No. of vaccations: ");
    int vac = input.nextInt();
    int salary = salaryCalculator(hours,amt,vac);
    System.out.println("Total Salary: " +salary);
  }
}
