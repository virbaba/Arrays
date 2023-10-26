/*
  merging two sorted array using 3 pointer
  i: denote ith element of arr1
  j: denote jth element of arr2
  k: denote kth right position of either ith or jth element
*/
import java.io.*;
import java.util.* ;

public class Solution {
   
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

        return arr1;
    }
}
