import java.util.* ;
import java.io.*; 
public class Solution {

	public static void reverse(int[] arr, int i, int j){
		// reversing
		while(i < j){
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;j--;
		}
	}
  
	public static void rotateArrayTwo(int n, int d, int r, int[] arr) {
		// Write your code here.
		char c = (char)d;
		if(r > n)
			r = r % n;
		if(c == 'f'){
			/* 
				for forward we follow 3 step
				1. reverse first n - r element
				2. reverse last r element
				3. reverse complete array
			*/

			int i = 0, j = n - r - 1;
			// 1. reverse first n - r element
			reverse(arr, i, j);

			i = n - r; j = n - 1;
			// 2. reverse last r element
			reverse(arr, i, j);

			i = 0; j = n - 1;
			// 3. reverse complete array
			reverse(arr, i, j);

		}

		if(c == 'b'){
			/*
				for backward we follow 3 step
				1. reverse first r element
				2. reverse last n - r element
				3. reverse complete array
			*/

			int i = 0, j = r - 1;
			// 1. reverse r element
			reverse(arr, i, j);

			i = r; j = n - 1;
			// 2. reverse n - r element
			reverse(arr, i, j);

			i = 0; j = n - 1;
			// 3. reverse complete array
			reverse(arr, i, j);

		}
	}
}
