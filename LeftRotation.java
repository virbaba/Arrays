/*
  FIRST APPROACH 
  HERE WE FIND THE POSITION OF AN ELEMENT. SUPPOSE K = 3
  FOR 1ST ELEMENT 0 - 3 = -3 -> 5 + (-3) = 2
  FOR 2ND ELEMENT 1 - 3 = -2 -> 5 + (-2) = 3
  FOR 3RD ELEMENT 2 - 3 = -1 -> 5 + (-1) = 4
  FOR 4TH ELEMENT 3 - 3 = 0
  FOR 5TH ELEMENT 4 - 3 = 1

  TIME COMPLEXTIY: O(N)
  SPACE COMPLEXITY: O(N)
  
*/
import java.util.*;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
         ArrayList<Integer> ans = new ArrayList<>(arr);
        if(arr.size() <= 1)
            return arr;

        for(int i = 0; i < n; i++){
            int diff = i - k;
            if(diff < 0){
                int pos = n + diff;
                ans.set(pos, arr.get(i));
            }
            else{
                ans.set(diff, arr.get(i));
            }
        }

        return ans;
    }
}

/*
  APPROACH 2
  
  WE CAN OPTIMIZED THE SPACE

  1 REVERSE K ELEMENT
  2 REVERSE N-K ELEMENT
  3 REVERSE COMPLETE ARRAY
  
*/

public class ArrayLeftRotation {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle the case where k is greater than n

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining n-k elements
        reverse(arr, k, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        leftRotate(arr, k);

        System.out.println("\nArray after " + k + " left rotations:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
