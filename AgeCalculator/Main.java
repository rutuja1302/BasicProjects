/*Age calculator- input-> birth date,month,year
                   output -> age in years, months, days*/
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;  //to calculate period between two values

public class Main{
  public static void main(String [] args){
   Scanner obj = new Scanner(System.in);
   
   System.out.println("Date of birth(DD/MM/yyyy): ");
   System.out.print("Date: ");
   int birthDate = obj.nextInt();
   System.out.print("Month: ");
   int birthMon = obj.nextInt();
   System.out.print("Year: ");
   int birthYear = obj.nextInt();
   
   System.out.println("Age at the date of (DD/MM/yyyy): ");
   System.out.print("Date: ");
   int currDate = obj.nextInt();
   System.out.print("Month: ");
   int currMon = obj.nextInt();
   System.out.print("Year: ");
   int currYear = obj.nextInt();
   
   LocalDate date = LocalDate.now();
   LocalDate birth = LocalDate.of(birthYear,birthMon,birthDate);
   LocalDate curr = LocalDate.of(currYear,currMon,currDate);
   
   int years = Period.between(birth,curr).getYears();
   int months = Period.between(birth,curr).getMonths();
   int days = Period.between(birth,curr).getDays();
   System.out.println("Age: ");
   System.out.println(years +"Years\t"+ months+ "Months\t"+ days+ "Days");
  }
}
