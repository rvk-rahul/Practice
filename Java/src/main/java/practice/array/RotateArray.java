package practice.array;

import practice.util.ArrayUtils;

// https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
public class RotateArray {

    void reverseArr(int arr[], int i, int j) {
        for (; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //Function to rotate an array by d elements in counter-clockwise direction.
    void rotateArr(int arr[], int d, int n) {
        // add your code here

        if (d >= n) {
            return;
        }

        reverseArr(arr, 0, n - 1);

        reverseArr(arr, 0, n - d - 1);

        reverseArr(arr, n - d, n - 1);

    }

    public RotateArray() {
        System.out.println("##############################");
        System.out.println("Rotate an Array");
        int arr[] = {1, 3,  5, 2, 2};
        rotateArr(arr, 4, arr.length);
        ArrayUtils.printArray(arr);
        arr = new int[]{-7, 1, 5, 2, -4, 3, 0};
        rotateArr(arr, 3, arr.length);
        ArrayUtils.printArray(arr);
        arr = new int[]{1, 2, 3};
        rotateArr(arr, 2, arr.length);
        ArrayUtils.printArray(arr);
        arr = new int[]{1,2,3,4,5};
        rotateArr(arr, 2, arr.length);
        ArrayUtils.printArray(arr);
        arr = new int[]{2,4,6,8,10,12,14,16,18,20};
        rotateArr(arr, 3, arr.length);
        ArrayUtils.printArray(arr);
        arr = new int[]{2,4,6,8,10,12,14,16,18,20};
        rotateArr(arr, 8, arr.length);
        ArrayUtils.printArray(arr);
        arr = new int[]{40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45,
                20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71,
                69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
        rotateArr(arr, 69, arr.length);
        ArrayUtils.printArray(arr);
        System.out.println("##############################");
    }
}
