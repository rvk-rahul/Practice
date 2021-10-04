package practice;
// you can also use imports, for example:

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//int A[] = new int[]{5,2,4,6,3,7};
public class WeakestChainLink {

    private static int solution(int [] A) {
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

    public WeakestChainLink() {
        List<int[]> lstA = new ArrayList<>();
        lstA.add(new int[]{ 5, 2, 4, 6, 3, 7});
        lstA.add(new int[]{ 5, 2, 4, 6, 3});
        lstA.add(new int[]{ 5, 100, 2, 300, 3});
        lstA.add(new int[]{ 5, 100, 200, 300, 3});
        lstA.add(new int[]{ 5, 100, 500, 300, 3});
        lstA.add(new int[]{ 5, 2, 4, 6, 3, 7});
        lstA.add(new int[]{ 5, 4, 2, 6, 3, 7});
        lstA.add(new int[]{ 5, 4, 2, 2, 6, 3, 7});
        lstA.add(new int[]{ 5, 4, 2, 2, 2, 3, 7});
        lstA.add(new int[]{ 5, 4, 2, 3, 4, 5, 7});
        lstA.add(new int[]{ 5, 4, 5, 5, 2, 3, 7});
        lstA.add(new int[]{ 1, 4, 5, 5, 2, 3, 1});
        lstA.add(new int[]{ 1, 4, 5, 5, 2, 1, 1});
        lstA.add(new int[]{ 1, 4, 5, 5, 2, 1, 1, 9, 3, 5, 3, 6});
        lstA.add(new int[]{ 2, 5, 6, 6, 3, 2, 2, 9, 4, 6, 4, 7});
        lstA.add(new int[]{ 2, 5, 6, 6, 3, 1, 2, 9, 4, 6, 4, 7});
        lstA.add(new int[]{ 2, 5, 6, 6, 2, 1, 3, 9, 4, 6, 4, 7});
        lstA.add(new int[]{ 2, 5, 6, 6, 2, 1, 2, 9, 4, 6, 4, 7});
        lstA.add(new int[]{ 2, 1, 2, 1, 5, 5, 5, 5, 5, 5, 5, 5});
        lstA.add(new int[]{ 2, 1, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5});
        lstA.add(new int[]{ 2, 2, 2, 1, 5, 5, 5, 5, 5, 5, 5, 5});
        lstA.add(new int[]{ 1, 4, 5, 5, 2, 1, 1});

        List<Integer> ans = new ArrayList<>();
        ans.add(5);
        ans.add(8);
        ans.add(400);
        ans.add(400);
        ans.add(400);
        ans.add(5);
        ans.add(5);
        ans.add(5);
        ans.add(4);
        ans.add(6);
        ans.add(6);
        ans.add(6);
        ans.add(5);
        ans.add(3);
        ans.add(5);
        ans.add(5);
        ans.add(5);
        ans.add(4);
        ans.add(2);
        ans.add(3);
        ans.add(3);
        ans.add(5);

        for (int i = 0; i< ans.size(); i++) {
            System.out.println(ans.get(i) + ":" + solution(lstA.get(i)));
        }
    }
}