/*Fabonacci sequence
formula : Xn+2 = Xn+1 + Xn */

import java.util.Scanner;
import java.util.ArrayList;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number from 1 to 100: ");
    int n = scan.nextInt();
    if(n<=100){
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0);
    list.add(1);
    for(int i=0 ; i<=n ; i++){
      int res = list.get(i)+list.get(i+1);
      list.add(res);
    }
    System.out.println(list);
    }else{
      throw new ArithmeticException("Error");
    }
  }
}
