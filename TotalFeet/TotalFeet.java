/*Program Statement:
 * Given an array of integers representing measurements in inches, write a program to calculate the total of measurements in feet. Ignore the measurements those are less than a feet(e.g. 10)
 * Note:
 * You are expected to write code in the findTotalFeet function only which will receive the first parameter as the number of items in the array and second parameter as the array itself.
 * You are not required to take input from the console.
 * 
 * Example:
 * Finding the total measurements in feet from a list of 5 numbers
 * Input
 * Input 1: 5
 * Input 2: 18 11 27 12 14
 * Output
 * 5*/

import java.util.Scanner;
public class TotalFeet {
	public static int findTotalFeet(int size,int[] array) {
		int result=0;
		for(int i=0;i<size;i++) {
			if(array[i]>=12) {
				result += array[i]/12;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input 1:");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.print("Input 2:");
		for(int i=0;i<size;i++) {
			array[i] = scan.nextInt();
		}
		int result = findTotalFeet(size,array);
		System.out.println(result);
	}
}
