import java.util.Scanner;

public class MyClass{
public static void main(String [] args){
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number: ");
int myVar = obj.nextInt();

for(int i=1 ; i<=10 ; i++){
System.out.println(myVar +"x"+ i+ "=" +myVar*i);
}

}
}
