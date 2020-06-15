/*A simple program to count vowels */

import java.util.Scanner;
public class Count{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scan.nextLine().toLowerCase();
    char[] arr = str.toCharArray();
    char[] vowels = {'a','e','i','o','u'};
    int count=0;
    for(int i=0 ; i< arr.length ; i++){
      if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
        count++;
      }
    }
    System.out.println("Number of vowels: " +count);
  }
}
