package practice.other;

import java.util.Arrays;

public class CheckIfSplit {

    boolean checkIfSplit(int []values, int n, int x) {

        if (n != 0 && x % values[n - 1] == 0)
            return true;

        if (n == 0 || x < values[n - 1])
            return false;

        return checkIfSplit(values, n, x - values[n - 1]) || checkIfSplit(values, n -1, x);

    }

    public CheckIfSplit() {
        int []values = new int[] {5, 13};
        Arrays.sort(values);
        int x = 44;
        int n = values.length;

        for (int i= n - 1; i >= 0; i--) {
            if (values[i] <= x) {
                n = i + 1;
                break;
            }
        }

        System.out.println(checkIfSplit(values, n, x));
    }
}
