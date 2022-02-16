package practice.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintUtils {

    public static void printArray(int[] arr) {

        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        printArray(array);
    }

    public static void printArray(long[] arr) {

        Long[] array = Arrays.stream(arr).boxed().toArray(Long[]::new);

        printArray(array);
    }

    public static void printArray(double[] arr) {

        Double[] array = Arrays.stream(arr).boxed().toArray(Double[]::new);

        printArray(array);
    }

    public static <T> void printArray(T arr[]) {
        if (arr == null)
            return;

        String output = "[";

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            output = output + arr[i] + ", ";
        }

        output = output.substring(0, output.length() - 2) +"]";

        System.out.println(output);

    }

}
