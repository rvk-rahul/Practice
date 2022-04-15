package practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedList {

    List<Integer> mergeList(List<Integer> l1, List<Integer> l2) {

        List<Integer> l3 = new ArrayList<>();
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                l3.add(l1.get(i));
                i++;
            }
            else {
                l3.add(l2.get(j));
                j++;
            }
        }
        while (i < l1.size()) {
            l3.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            l3.add(l2.get(j));
            j++;
        }

        return l3;

    }

    public MergeTwoSortedList() {
        System.out.println("##############################");
        System.out.println("Merge Two Sorted List");

        List<Integer> l1 = Arrays.asList(new Integer[]{1, 3, 6});
        List<Integer> l2 = Arrays.asList(new Integer[]{2, 4, 5});
        System.out.println("Pass: " + (mergeList(l1, l2).equals(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6}))));

        System.out.println("##############################");

    }
}
