//Google Online Challenge 2020

/*Given an array of positive integers. 
 * The task is to find the size of the smallest subset such that the Bitwise OR of that set is Maximum possible.
 * */

/*Input : arr[] = {5, 1, 3, 4, 2}
Output : 2
7 is the maximum value possible of OR, 
5|2 = 7 and 5|3 = 7*/

/*Input : arr[] = {2, 6, 2, 8, 4, 5}
Output : 3
15 is the maximum value of OR and set
elements are 8, 6, 5*/

import java.util.*;
public class BitwiseOr {
	
	static void minSubset(int[] arr, int n, int max, int m) {
		//initializing a variable result which will store different element pair's bitwise or result
		int result;
		//initializing an arraylist to store all the results
		ArrayList<Integer> list = new ArrayList<Integer>();
		//traversing through all the array elements
		// i should always be less than or equal to n-m to form the perfect pairs of m elements
		//if i is greater then n-m, then array index out of bounds error will occur
		for(int i=0 ; i<=n-m ; i++) {
			//similar to i, j should be less than or equal to n-(m-1) & should start with i+1
			for(int j=i+1;j<=n-(m-1);j++) {
				//re-initializing result=0
				result = 0;
				result |= arr[i];
				
				for(int k=0; k<=m-2;k++) {
					//result = arr[i] | arr[j+0],arr[j+1],arr[j+2]...
					result |= arr[j+k];
				}
				list.add(result);
			}
		    //above traversing only calculate bitwise or for adjacent elements
			//below traversing will make sure all the evenly & oddly placed elements are compared as well
			//for example, in the eg2 array above, 15 is the maximum or obtained by oddly placed elements: 8,6,5 which is not possible using the above traversing
			if(m>2) {
		    	result = 0;
		    	//even placed elements
		    	for(int e=0; e<n; e+=2) {
		    		result |= arr[e];
		    		list.add(result);
		    	}
		    	//odd placed elements
		    	for(int o=1; o<n; o+=2) {
		    		result |= arr[o];
		    		list.add(result);
		    	}
		    }
		}
		//below if else will check if any results obtained match the maxOr value
		//if yes, then it prints the subset size
		//else it will increment the subset size by 1 & call the method again
		    if(list.contains(max)) {
			    System.out.println(m);
		    }else {
			    m++;
			    minSubset(arr,n,max,m);
		    }
	   		
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 4, 2};
		int max = 0;
		int n = arr.length;
		//finding or for all the elements of the array
		for(int i=0;i<n;i++) {
			max |= arr[i];
		}
		//max is 7
		//initializing minimum subset size
		int min_subSize = 2;
		//driver code
		minSubset(arr,n,max,min_subSize);
	}
		
}

