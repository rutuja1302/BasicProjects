import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int fine = 0;  //initializing fine
    //scanning actual return date, month, year
    int da = scan.nextInt();
    int ma = scan.nextInt();
    int ya = scan.nextInt();
    //scanning expected return date, month, year
    int de = scan.nextInt();
    int me = scan.nextInt();
    int ye = scan.nextInt();
    if(ya == ye){
      if(ma == me){
        if(da == de){
          fine = 0;
        }else if(da > de){
          fine = 15 * (da-de);
        }
      }else if(ma>me){
        fine = 500 * (ma-me);
      }
    }else if(ya > ye){
      fine = 1000;
    }
    System.out.println(fine);
  }//end of main 
}//end of class
