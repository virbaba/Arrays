public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        // two pointer approach
        int i = 0, j = arr.length - 1;
        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
            if(arr[i] == 0)
                i++;
            if(arr[j] == 1)
                j--;
        }
    }
}
