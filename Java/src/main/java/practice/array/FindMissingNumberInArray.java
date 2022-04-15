package practice.array;


// https://www.geeksforgeeks.org/find-the-missing-number/
public class FindMissingNumberInArray {

    private int findMissingNumber(int arr[], int n){
        int sumOfNNum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i : arr) actualSum += i;

        return sumOfNNum - actualSum;
    }

    public FindMissingNumberInArray() {
        int arr[] = new int[] {1, 2, 3, 5};
        System.out.println("#######################################");
        System.out.println("Find Missing Number in a Array");
        System.out.println(findMissingNumber(arr, arr.length + 1));
        System.out.println("#######################################");
    }
}
