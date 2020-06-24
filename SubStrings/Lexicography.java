/*
Lexicographical order -> A<B<C<...<Y<Z<a<b<c<...<y<z
little about compareTo() method -> The result is positive if fisrt string is lexographically greater than second string, 
                                   the result is negative if fisrt string is lexographically smaller than second string,
                                   the result will be "0" if strings are equal.
*/
import java.util.Scanner;

public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = sc.nextLine();
    System.out.print("Enter the length of substrings: ");
    int k = sc.nextInt();
    String copy = s.substring(0,k);
    String smallest = copy;
    String largest = copy;
    for(int i=k; i<s.length(); i++){
      copy = copy.substring(1,k) + s.charAt(i);
      if(largest.compareTo(copy) < 0){
        largest = copy;
      }else if(smallest.compareTo(copy) > 0){
        smallest = copy;
      }
    }
    System.out.println("Smallest: " +smallest);
    System.out.println("Largest: " +largest);
  }
}
