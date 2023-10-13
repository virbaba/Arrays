import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int sum)  {

	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    // Sort the array to handle duplicates efficiently
    Arrays.sort(arr);

    for (int i = 0; i < n - 2; i++) {
        // Avoid duplicate triplets with the same starting element
        if (i > 0 && arr[i] == arr[i - 1]) {
            continue;
        }

        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            int currentSum = arr[i] + arr[left] + arr[right];

            if (currentSum == sum) {
                ArrayList<Integer> triplet = new ArrayList<>();
                triplet.add(arr[i]);
                triplet.add(arr[left]);
                triplet.add(arr[right]);
                result.add(triplet);

                // Move the left and right pointers to avoid duplicates
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }
    }

    return result.isEmpty() ? new ArrayList<>() : result;
	}
}
