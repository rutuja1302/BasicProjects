/*Given a list which initially contains 0, the following queries can be performed:
 * 0 X: add X to the list
 * 1 X: replace each element “A” of the list by A^X, where ^ is the xor operator
 * Return a list with the result elements in increasing order.*/

/*5 (no of queries)
0 4
0 2
1 4
0 5
1 8
Answer: 8 9 12 14*/
import java.util.*;
public class Gocc2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//read number of queries
		int queries = scan.nextInt();
		//initialize a multi-dimensional array to store the queries
		//size of the main array=number of queries & size of the sub-arrays=2 i.e 0X or 1X
		int[][] arr = new int[queries][2];
		for(int i=0;i<queries;i++) {
			for(int j=0;j<2;j++) {
				int a = scan.nextInt();
				arr[i][j] = a;
			}
		}
		//Initialize a list for performing operations/queries
		ArrayList<Integer> list = new ArrayList<Integer>();
		//first element of the list is 0
		list.add(0);
		//add the elements(X) whose pairs starts with a 0
		for(int i=0;i<queries;i++) {
			if(arr[i][0]==0) {
				list.add(arr[i][1]);
			}
		}
		//xor each element with X where X is the second element of the pairs starting with 1 eg. [1 4]
		ArrayList<Integer> x = new ArrayList<Integer>();
		for(int i=0;i<queries;i++) {
			if(arr[i][0]==1) {
				x.add(arr[i][1]);
			}
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<x.size();i++) {
			for(int j=0;j<list.size();j++) {
				list.set(j,(list.get(j)^x.get(i)));
			}
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
