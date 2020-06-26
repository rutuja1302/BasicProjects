import java.util.Scanner;
public class Main{
  private static final int MAX = 6; //Size of the matrix
  private static final int OFFSET = 2; //hourglass width
  private static int matrix[][] = new int[MAX][MAX];
  private static int maxHourglass = -63; //initialize to lowest sum possible(-9*7)
  private static void hourglass(int i, int j){
    int tmp = 0;  //current hourglass sum
    //sum top 3 and bottom 3 elements
    for(int k=j; k<=j+OFFSET; k++){
      tmp+=matrix[i][k];
      tmp+=matrix[i+OFFSET][k];
    }
    //sum middle element
    tmp+= matrix[i+1][j+1];
    if(maxHourglass < tmp){
      maxHourglass = tmp;
    }
  }
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    for(int i=0; i<MAX; i++){
      for(int j=0; j<MAX; j++){
        matrix[i][j] = scan.nextInt();
      }
    }
    scan.close();
    //find maximum hourglass
    for(int i=0; i<MAX-OFFSET; i++){
      for(int j=0; j<MAX-OFFSET; j++){
        hourglass(i,j);
      }
    }
    System.out.println(maxHourglass);
  }
}
