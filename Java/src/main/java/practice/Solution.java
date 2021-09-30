package practice;
// you can also use imports, for example:

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//int A[] = new int[]{5,2,4,6,3,7};
class Solution {

    public static void lstPrintInt(List<Integer> lst){
        for (int i: lst) {
            System.out.println(i);
        }
    }
    public static void lstPrintStr(List<String> lst){
        for (String i: lst) {
            System.out.println(i);
        }
    }
    public static void treePrintInt(TreeSet<Integer> treeSet){
        for (int i: treeSet) {
            System.out.println(i);
        }
    }
    public static void printMap(Map<Character, Integer> characterIntegerMap){
        for (Map.Entry<Character, Integer> entry: characterIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static int solution(int [] A) {
        // write your code in Java SE 8

        // find second minimum
        int minimum = Integer.MAX_VALUE;
        int minimum_index = 0;
        int second_minimum = Integer.MAX_VALUE;
        int second_minimum_index = 0;

        for (int i = 1; i< A.length -1; i++) {
            if (minimum > A[i]){
                second_minimum = minimum;
                second_minimum_index = minimum_index;
                minimum = A[i];
                minimum_index = i;
            }
            else if (second_minimum > A[i] && minimum != A[i]) {
                second_minimum = A[i];
                second_minimum_index = i;
            }
        }

        // Search left of second minimum for smallest and smaller than second_minimum
        if (minimum_index < second_minimum_index)
            return minimum + second_minimum;
        else {//Search right  of second minimum for smallest but greater than or equal to second_minimum
            int another_minimum = Integer.MAX_VALUE;
            for (int i = second_minimum_index + 1; i < A.length; i++) {
                if (A[i] >= second_minimum && another_minimum > A[i]) {
                    another_minimum = A[i];
                }
            }
            return second_minimum + another_minimum;
        }

//        Map<Character, Integer> characterIntegerMap = new HashMap<>();
//
//        for (int i = 0; i < S.length(); i++) {
//            if (characterIntegerMap.containsKey(S.charAt(i))) {
//                characterIntegerMap.put(S.charAt(i), characterIntegerMap.get(S.charAt(i)) + 1);
//            }
//            else
//                characterIntegerMap.put(S.charAt(i), 1);
//        }
//
////        List<Integer> lst = new ArrayList<>();
////        for (Map.Entry<Character, Integer> entry: characterIntegerMap.entrySet()) {
////            lst.add(entry.getValue());
////        }
////        Collections.sort(lst);
//
//        Queue<Integer> queue = new PriorityQueue<>((i, j) -> Integer.compare(j, i));
//
//        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
//            queue.add(entry.getValue());
//        }
//
//
//        int count = 0;
//
//        while (!queue.isEmpty())
//        {
//            int top = queue.peek();
//            queue.remove();
//            if (queue.isEmpty()) {
//                return count;
//            }
//            if (top == queue.peek()) {
//                if (top > 1) {
//                    queue.add(top - 1);
//                }
//                count++;
//            }
//        }
//        return count;
    }
}