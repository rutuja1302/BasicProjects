/*Secure Password Generator
  In this program password length is set to range 6-50
*/

import java.util.Scanner;
import java.util.Random;

public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("......Password Generator......");
    System.out.print("Enter Password Length(6-50): ");
    int len = scan.nextInt();
    if(len>=6 && len<=50){
      char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9','@','$','&','%','!','?','*'};
      Random rand = new Random();
      int i=0;
      System.out.print("Your New Password: ");
      while(i != len){
        int num = rand.nextInt(arr.length -1)+1;
        System.out.print(arr[num]);
        i++;
      }
    }else if(len<6){
      System.out.println("Too weak password!");
    }else{
      System.out.println("Length exceeded limit!");
    }
  }
}
