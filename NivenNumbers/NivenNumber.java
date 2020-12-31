/* Niven Numbers
 * Niven Numbers are positive integers greater than 0 that are divisible by the sum of their digits. 
 * For example, 42 is a niven number, it is divisible by 4+2=6.
 * 
 * You are given a niven number 'n', If n is niven, then return the number of times it is divisible by the sum of its digits(i.e the quotient), else return 0.
 * 
 * Examples:
 * Input: 36
 * Output: 4
 * Explanation: 3+6=9 & 36/9=4
 * 
 * Input: 57
 * Output: 0
 * Exp: 5+7=12 & 57 is not divisible by 12
 */
import java.util.Scanner;
public class NivenNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer num = scan.nextInt();  //read the input
		
		String val = num.toString();  //convert integer to string then to characters to add each single digit
		char[] arr = val.toCharArray();
		
		//calculate sum of each digit of 'n'
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += Character.getNumericValue(arr[i]);
		}
		
		//check if divisible or not, if not return 0, if yes then return the quotient
		if(num%sum==0) {
			System.out.println(num/sum);
		}else {
			System.out.println(0);
		}
	}
}
