import java.util.*;
public class Main{
  public static int[] x;
  public static void bubbleSort(){
    int n = x.length;
    int totalSwaps = 0;
    for(int i=0; i<n; i++){
      int numSwaps = 0;
      for(int j=0; j<x.length-1; j++){
        if(x[j] > x[j+1]){
          int tmp = x[j];
          x[j] = x[j+1];
          x[j+1] = tmp;
          numSwaps++;
          totalSwaps++;
        }
      }
      if(numSwaps == 0){
        System.out.println("Array is sorted in " +totalSwaps+" swaps.");
        System.out.println("First Element: " +x[0]);
        System.out.println("Last Element: " +x[n-1]);
        break;
      }
    }
  }
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    x = new int[n];
    for(int i=0; i<n; i++){
      x[i] = in.nextInt();
    }
    bubbleSort();
  }
}
