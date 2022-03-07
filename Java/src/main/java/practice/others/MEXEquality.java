package practice.others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Question at src/main/resources/QuestionInImage/MEXEquality
public class MEXEquality {

    static int findMEX(int[][] Arr, int N, int M) {

        Set<Integer> allNumberSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                allNumberSet.add(Arr[i][j]);
            }
        }

        int [] allNumber = new int[allNumberSet.size()];

        int n = 0;
        for (int s: allNumberSet) {
            allNumber[n] = s;
            n++;
        }
        Arrays.sort(allNumber);

        int MEX = 1;

        for(int i = 0; i< allNumber.length; i++) {
            if(allNumber[i] == MEX) {
                MEX++;
            }
            else
                break;
        }
        return MEX;
    }

    static int minOperations(int arr1[], int n, int x) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        int p = 0;
        int arr[] = new int[set.size()];
        for (int s: set) {
            arr[p] = s;
            p++;
        }
        n = arr.length;
        int k = x;
        n--;
        while (n > -1) {
            if (arr[n] < x)
                k--;

            if (arr[n] == x)
                k++;

            n--;
        }
        return k - 1;
    }

    static int getMEXEquality(int N, int M, int[][] Arr){
        // code here
        int result = 0;

        int MEX = findMEX(Arr, N, M);

        for (int i = 0; i < N; i++) {
            result += minOperations(Arr[i], Arr[i].length, MEX);
        }
        return result;

    }

    public MEXEquality() {
        System.out.println("##############################");
        System.out.println("MEX Equality");

        int [][] Arr = new int[][]{{2,3,5,7},{1,4,5,6}};
        System.out.println(getMEXEquality(Arr.length, Arr[0].length, Arr));

        Arr = new int[][]{{7,9,8,1,9},{6,10,8,8,6}};
        System.out.println(getMEXEquality(Arr.length, Arr[0].length, Arr));

        Arr = new int[][]{{10,3,3,9,1},{10,5,8,1,10}};
        System.out.println(getMEXEquality(Arr.length, Arr[0].length, Arr));

        Arr = new int[][]{{10,3,3,9,1},{10,5,8,1,10},{1,2,4,6,7}};
        System.out.println(getMEXEquality(Arr.length, Arr[0].length, Arr));

        System.out.println("##############################");
    }
}
