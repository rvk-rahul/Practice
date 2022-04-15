package practice.array;


// https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
public class SmallestMissingPositiveInteger {

    int findSmallestMissingPositiveInteger(int[] arr) {
        // write your code in Java SE 8
        if(arr == null || arr.length == 0) return 1;

        int size = arr.length, containsOne = 0;

        for (int i = 0; i<size;i++) {
            if (arr[i] == 1) {
                containsOne = 1;
            }

            else if (arr[i] <= 0 || arr[i] > size)
                arr[i] =1;
        }

        if (containsOne == 0) return 1;

        for (int i = 0; i<size;i++) {
            int index = Math.abs(arr[i]) -1;
            if (arr[index] > 0)
                arr[index] = -1 * arr[index];
        }
        for (int i = 0; i<size;i++) {
            if (arr[i] > 0)
                return i + 1;
        }
        return size + 1;
    }

    public SmallestMissingPositiveInteger() {
        int arr[] = new int[] {1, 2, 3, 5};
        System.out.println("#######################################");
        System.out.println("Find Smallest Missing Positive Integer in an Array");
        System.out.println(findSmallestMissingPositiveInteger(arr));
        System.out.println("#######################################");

    }
}
