package practice;

public class SmallestMissingPositiveInteger {

    int findSmallestMissingPositiveInteger(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length == 0) return 1;

        int n = A.length, containsOne = 0;

        for (int i = 0; i<n;i++) {
            if (A[i] == 1) {
                containsOne = 1;
            }

            else if (A[i] <= 0 || A[i] > n)
                A[i] =1;
        }

        if (containsOne == 0) return 1;

        for (int i = 0; i<n;i++) {
            int index = Math.abs(A[i]) -1;
            if (A[index] > 0)
                A[index] = -1 * A[index];
        }
        for (int i = 0; i<n;i++) {
            if (A[i] > 0)
                return i + 1;
        }
        return n + 1;
    }

    public SmallestMissingPositiveInteger() {
        int arr[] = new int[] {1, 2, 3, 5};
        System.out.println("#######################################");
        System.out.println("Find Smallest Missing Positive Integer in an Array");
        System.out.println(findSmallestMissingPositiveInteger(arr));
        System.out.println("#######################################");

    }
}
