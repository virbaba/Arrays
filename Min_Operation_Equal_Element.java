import java.util.* ;
import java.io.*; 
public class Solution {	
	public static int minimumOperation(int[] arr, int n) {
		// Write your code here.

		// Step 1: Create a HashMap to count frequencies of elements
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Step 2: Populate the frequency map
        for (int num : arr) 
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        
        // Step 3: Find the element with the maximum frequency
        int maxFrequency = 0;
        for (int count : frequencyMap.values())
            maxFrequency = Math.max(maxFrequency, count);
        
        // Step 4: Calculate the minimum number of operations
        int operations = n - maxFrequency;
        
        return operations;
	}
}
