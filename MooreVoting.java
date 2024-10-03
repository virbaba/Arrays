import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		// Moore's Voting algo
		int el = 0, count = 0;
		for(int ele : arr){
			if(count == 0){
				count = 1;
				el = ele;
			}else if(ele == el){
				count++;
			}else if(ele != el)
				count--;
		}

		count = 0;
		for(int ele : arr){
			if(ele == el)
				count++;
		}

		if(count > (n / 2))
			return el;
		
		return -1;
	}
}
