/*Logic ->
  The minute hand moves 360 degrees in 60 minutes
  & The hour hand moves 360 degrees in 12 hours
  So, the minute hand moves 6 degrees in 1minute(Hence formula 6*mins)
  & hour hand moves 0.5 degrees in 1minute(Hence formula [(hour*60 +mins)*0.5])*/
import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter hour: ");
    int hour = scan.nextInt();
    System.out.print("Enter minutes: ");
    int mins = scan.nextInt();
    
    int angleHour = mins*6;
    double  angleMin = (hour*60 +mins)*0.5;
    double  angle = Math.abs(angleHour - angleMin);
    System.out.println("Angle between Hour and Minute hand is: " +angle+ " degrees");
  }
}
