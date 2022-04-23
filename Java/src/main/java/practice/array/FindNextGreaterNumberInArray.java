package practice.array;

import practice.util.ArrayUtils;

import java.util.Stack;

public class FindNextGreaterNumberInArray {

    void printNextGreaterNumber(int []arr) {
        Stack<Integer> stack = new Stack<>();
        int len = arr.length;
        int []result = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
               while (!stack.isEmpty() && stack.peek() <= arr[i])
                   stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        ArrayUtils.printArray(result);
    }

    public FindNextGreaterNumberInArray() {
        int [] arr = {1, 3, 2, 4};
        printNextGreaterNumber(arr);
    }
}
