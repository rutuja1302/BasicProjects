import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int guess = random.nextInt(100)+1;  //Generate a random number from 1 to 100
		System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
		System.out.print("Guess the number from 1 to 100: ");
		int num = scan.nextInt();  //read input
		while(num != guess) {  //this loop will iterate until the random generated number matches the user input
			if(num>guess) {   //if number entered is greater than guess, display the number is less and read input again
				System.out.println("NO! Hint: The number is less than "+num+" Try Again!");  
				System.out.print("Enter number: ");
				num = scan.nextInt();
			}else if(num<guess) {  //if number entered is less than guess, display the number is greater and read input again
				System.out.println("NO! Hint: The number is greater than "+num+" Try Again!");
				System.out.print("Enter number: ");
				num = scan.nextInt();
			}
		}
		//Once the number entered matches the random number generated, system will come out of the while loop and display the below message
		System.out.println("Congratulations! You Guessed it correct!!");
		System.out.println("The Number is: "+guess);
	}
}
