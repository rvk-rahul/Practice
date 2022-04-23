package practice.array;

import practice.util.ArrayUtils;

// https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
public class CountFrequencyInArray {

    void countFrequency(int arr[], int N, int P) {

        for (int i = 0; i < N; i++) {
            if (arr[i] > N)
                arr[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] != 0 && arr[i] % (N + 1) != 0) {
                int indexToChange = arr[i] % (N + 1);
                arr[indexToChange - 1] = arr[indexToChange - 1] + N + 1;
            }
        }

        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / (N + 1);
        }
    }

    public CountFrequencyInArray() {
        System.out.println("##############################");
        System.out.println("Count Frequency In Array");
        int p = 3;
        int[] arr = new int[]{2, 3, 2, 3, 1};

        countFrequency(arr, arr.length, p);
        ArrayUtils.printArray(arr);

        arr = new int[]{2, 4, 5, 6, 8};
        p = 10;
        countFrequency(arr, arr.length, p);
        ArrayUtils.printArray(arr);

        System.out.println("##############################");
    }

}
