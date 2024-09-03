import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

/*
	Remember 4 condition
	1. All number is positive
	2. Even elements is positive
	3. Odd elements is positive
	4. Array have 0
*/
public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int max = Integer.MIN_VALUE;
		int prefix = 1, suffix = 1;
		for(int i = 0; i < n; i++){
			if(prefix == 0)
				prefix = 1;
			if(suffix == 0)
				suffix = 1;

			prefix *= arr.get(i);
			suffix *= arr.get(n - i - 1);

			max = Math.max(max, Math.max(prefix, suffix));
		}
		return max;
	}
}
