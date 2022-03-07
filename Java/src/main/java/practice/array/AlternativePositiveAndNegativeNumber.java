package practice.array;

import practice.util.PrintUtils;

import java.util.LinkedList;
import java.util.List;

public class AlternativePositiveAndNegativeNumber {
    void rearrange(int arr[], int n) {
        // code here
        List<Integer> positive = new LinkedList<>();
        List<Integer> negative = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive.add(arr[i]);
            }
            else
                negative.add(arr[i]);
        }
        boolean positiveFlag = positive.size() > 0;
        for (int i = 0; i < n; i++) {
            if (positiveFlag && positive.size() > 0 || negative.size() == 0) {
                arr[i] = positive.remove(0);
                positiveFlag = false;
            }
            else if (!positiveFlag && negative.size() > 0 || positive.size() == 0) {
                arr[i] = negative.remove(0);
                positiveFlag = positive.size() > 0;
            }
        }
    }

    public AlternativePositiveAndNegativeNumber() {
        System.out.println("##############################");
        System.out.println("Alternate positive and negative number");
        int [] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr, arr.length);
        PrintUtils.printArray(arr);
        arr = new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr, arr.length);
        PrintUtils.printArray(arr);

        System.out.println("##############################");
    }
}
