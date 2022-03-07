package practice.array;

import java.util.ArrayList;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/plus-one/1/
public class PlusOne {

    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here
        int sum = arr.get(N - 1) + 1;
        int carry = sum / 10;
        arr.set(N - 1, sum % 10);
        for (int i = N - 2; i >= 0 && carry > 0; i--) {
            sum = arr.get(i) + carry;
            carry = sum / 10;
            arr.set(i, sum % 10);
        }

        if (carry > 0) {
            arr.add(0, carry);
        }
        return arr;
    }

    public PlusOne() {
        System.out.println("##############################");
        System.out.println("Plus One");
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 4}));
        System.out.println(increment(arr, arr.size()));

        arr = new ArrayList<>(Arrays.asList(new Integer[]{9, 9, 9}));
        System.out.println(increment(arr, arr.size()));

        System.out.println("##############################");
    }
}
