package practice;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/
public class FindSmallestNumberNotSum {

    long smallestpositive(long[] array, int n){
        // Your code goes here
        long res = 1;

        Arrays.sort(array);

        for (int i = 0; i < n; i++) {
            if (array[i] > res) {
                return res;
            }
            else {
                res += array[i];
            }
        }

        return res;
    }

    public FindSmallestNumberNotSum() {
        System.out.println("##############################");
        System.out.println("Find smallest +ve number which is not a sum of subset of given array");
        long arr[] = {1, 2,  6, 10, 7, 9};
        System.out.println(smallestpositive(arr, arr.length));
        System.out.println("##############################");
    }
}
