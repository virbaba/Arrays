/*
  TIME COMPLEXITY: O(N)
  SPACE COMPLEXITY: O(1)
  in this code we using the functionality of XOR which help to remove the duplicate element like:
  0 0 -> 0
  0 1 -> 1
  1 0 -> 1
  1 1 -> 0
*/
public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
      int res = 0;
      for(int e : arr){
        res ^= e;
      }
      return res;
    }
}
