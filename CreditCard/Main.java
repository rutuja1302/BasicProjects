/*Credit card validator
   Steps - 1) length should be 16
           2) Separate even & odd placed values
           3) Count the number of digits greater than 4 in first set
           4) Add all the digits in first set & double the answer
           5) Add all the digits in second set
           6) Add step3, step4 & step5
           7) if answer is divisible by 10 then number is valid*/

import java.util.Scanner;
import java.util.ArrayList;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a credit card number: ");
    Long num = scan.nextLong();
    
    //to calculate length of the input
    String copyNum = num.toString();
    
    if(copyNum.length() == 16){
      //to separate even & odd placed values
      char[] arr = copyNum.toCharArray();
      int[] a = new int[arr.length];
      for(int i=0 ; i<arr.length ; i++){
        a[i] = Character.getNumericValue(arr[i]);
      }
      ArrayList<Integer> even = new ArrayList<Integer>();
      ArrayList <Integer> odd = new ArrayList<Integer>();
      for(int j=0 ; j<a.length ; j++){
        if(j%2 == 0){
          even.add(a[j]);
        }else{
          odd.add(a[j]);
        }
      }
      //step3
      int counter = 0;
      for(int k=0; k<even.size(); k++){
        if(even.get(k)> 4){
          counter++;
        }
      }
      //step4
      int set1 = 0;
      for(int l=0; l<even.size(); l++){
        set1 = even.get(l)+set1;
      }
      //step5
      int set2 = 0;
      for(int m=0; m<odd.size(); m++){
        set2 = odd.get(m)+set2;
      }
      //add counter, set1*2 , set2
      int result = counter + (2*set1) + set2;
      //check if result is divisible by 10
      if(result%10 ==0){
        System.out.println("The number is valid");
      }else{
        System.out.println("The number is not valid");
      }
      
    }else{
      throw new ArithmeticException("Enter valid number");
    }
  }
}
