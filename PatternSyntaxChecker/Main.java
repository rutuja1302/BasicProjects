import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    //scanning number of test cases
    int testCases = scan.nextInt();
    scan.nextLine();
    while(testCases > 0){
      String pattern = scan.nextLine();
      try{
        Pattern.compile(pattern);
        System.out.println("Pattern Valid");
      }catch(PatternSyntaxException e){
        System.out.println("Pattern Invalid");
      }
      testCases--;
    }
  }
}
