package practice.array;

import practice.util.PrintUtils;

// https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
public class CountFrequencyInArray {

    void countFrequency(int arr[], int N, int P) {

        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] - 1;
        }

        for (int i = 0; i < N; i++) {
            arr[arr[i] % N] = arr[arr[i] % N] + N;
        }

        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / N;
        }
    }

    public CountFrequencyInArray() {
        System.out.println("##############################");
        System.out.println("Count Frequency In Array");
        int p = 3;
        int[] arr = new int[]{2, 3, 2, 3, 1};

        countFrequency(arr, arr.length, p);
        PrintUtils.printArray(arr);

        arr = new int[]{2, 4, 5, 6, 8};
        p = 10;
        countFrequency(arr, arr.length, p);
        PrintUtils.printArray(arr);

        System.out.println("##############################");
    }

}
