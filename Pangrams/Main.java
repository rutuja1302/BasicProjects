/*Logic - 
  Program will first accept a string
  Split into substrings to get rid of the spaces between words
  substrings will be converted into array of characters
  These characters will be added in a list
  Then we will remove the duplicate characters(repeating chars) by using hashset
  You can remove duplicate characters by quicksorting also
  After removing duplicate characters, we will check if the set's size is 26(alphabets)
  if the size is 26 then the string is pangram or else not.*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Character> list = new ArrayList<Character>();
    System.out.print("Enter a string: ");
    String str = scan.nextLine().toLowerCase();
    String[] substr = str.split(" ");
    for(String a: substr){
      char[] arr = a.toCharArray();
      for(char b: arr){
        list.add(b);
      }
    }
    Set set = new HashSet();
    for(int i=0; i<list.size(); i++){
      set.add(list.get(i));
    }
    if(set.size() == 26){
      System.out.println("Pangram String");
    }else{
      System.out.println("Not a Pangram String");
    }
  }
}
