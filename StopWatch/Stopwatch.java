import java.util.Scanner;
public class StopWatch{
  public static long startTimer = 0;
  public static long stopTimer = 0;
  public static long elapsedTime;
  public static void start(){
    startTimer = System.currentTimeMillis(); //returns current time in milliseconds
    System.out.println("Start Time: " +startTimer+ " milliseconds");
  }
  public static void stop(){
    stopTimer = System.currentTimeMillis();
    System.out.println("Stop Time: " +stopTimer+ " milliseconds");
  }
  public static long elapsed(){
    elapsedTime = stopTimer - startTimer;
    return elapsedTime;
  }
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Press 1 to start: ");
    int a = scan.nextInt();
    if(a==1){
      start();
    }
    
    System.out.print("Press 2 to stop: ");
    int b = scan.nextInt();
    if(b==2){
      stop();
    }
    
    long time = elapsed();
    System.out.println("Elapsed Time: " +time/1000+ " secs");
  }
}
