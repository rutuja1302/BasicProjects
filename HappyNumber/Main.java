/*First we will take a number as an input
  Separate and square each digit and add them together
  Keep on squaring and adding until the result is 1 or the number itself
  If the result is 1 then the number is a happy number, if the result is same as the input number then the number is unhappy
  Example -
  19 --> 82 --> 68 --> 100 --> 1 --> HAPPY NUMBER
      |      |      |       |
    1²+9²   8²+2²  6²+8²   1²+0+0

   4 --> 16 --> 37 --> 58 --> 89 --> 145 --> 42 --> 20 --> 4 --> UNHAPPY NUMBER
      |      |      |      |      |       |      |      |
      4²   1²+6²  3²+7²   5²+8²  8²+9² 1²+4²+5² 4²+2²  2²+0
*/

import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Pick a Number: ");
    int num = scan.nextInt();
    int print = num;
    int result = 0;
    while(result!=1 || result!=num){
      result = 0;
      while(num>0){
        result += Math.pow(num%10,2);
        num = num/10;
      }
      num=result;
    }
    if(result == 1){
      System.out.println(print+ " is a Happy Number");
    }else{
      System.out.println(print+ " is a Unhappy Number");
    }
  }
}
