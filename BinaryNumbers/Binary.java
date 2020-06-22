import java.util.*;
import java.lang.Math;
public class Main{
  private static final Scanner scanner = new Scanner(System.in);
  public static void main(String [] args){
    ArrayList<Integer> list = new ArrayList<Integer>();
    int n = scanner.nextInt();
    String binary = Integer.toBinaryString(n);
    String[] arr = binary.split("0");
    for(String a: arr){
      int size = a.length();
      list.add(size);
    }
    int max = Collections.max(list);
    System.out.println(max);
  }
}
