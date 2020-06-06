import java.util.Scanner;


public class Main{
  public static void main(String [] args){

    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a string");
    String code = obj.nextLine();
    char [] arr = code.toCharArray();
   
    //for words which starts from vowels
    if(arr[0]=='a' || arr[0]=='e' || arr[0]=='i' || arr[0]=='o' || arr[0]=='u'){
      System.out.println(code+ "way");
    }else{
      //for words which starts with consonants 
      System.out.println(code.substring(1) +arr[0]+ "ay");
    }
      
  }
}
