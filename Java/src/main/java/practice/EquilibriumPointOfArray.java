package practice;

//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
public class EquilibriumPointOfArray {

    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
     int equilibriumPoint(long arr[], int n) {

        // Your code here
         if (n == 1)
             return 1;

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        long leftSum = arr[0];

        for (int i = 1; i < n; i++) {
            long rightSum = totalSum - (leftSum + arr[i]);
            if (leftSum == rightSum)
                return i + 1;
            leftSum += arr[i];
        }

         return 0;
    }

    public EquilibriumPointOfArray() {
        System.out.println("##############################");
        System.out.println("Equilibrium Point of Array");
        long arr[] = {1, 3,  5, 2, 2};
        System.out.println(equilibriumPoint(arr, arr.length));
        arr = new long[]{-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibriumPoint(arr, arr.length));
        arr = new long[]{1, 2, 3};
        System.out.println(equilibriumPoint(arr, arr.length));
        System.out.println("##############################");
    }
}
