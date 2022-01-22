package practice;

public class Main {

    public static void main(String[] args) {

        new ConwaysGameOfLife();
        new BowlingSingle();
        new LongestPalindrome();
        new FindMissingNumberInArray();
        new TrailingZeroesInFactorial();
        new SimpleFraction();

    }
}

//
////import java.io.*;
////import java.math.*;
////import java.security.*;
////import java.text.*;
////import java.util.*;
////import java.util.concurrent.*;
////import java.util.function.*;
////import java.util.regex.*;
////import java.util.stream.*;
////import static java.util.stream.Collectors.joining;
////import static java.util.stream.Collectors.toList;
////
////public class Main {
////
////    static void printMat(List<List<Integer>> matrix) {
////        System.out.println("matrix:  ");
////        for (List<Integer> lst: matrix) {
////            for (int i : lst) {
////                System.out.print(i +",");
////            }
////            System.out.println();
////        }
////    }
////    static void printList(List<Integer> lst) {
////        System.out.println("list:  ");
////            for (int i : lst) {
////                System.out.print(i +",");
////            }
////    }
////
////    // Complete the countConnections function below.
////    static int countConnections(List<List<Integer>> matrix) {
////        int count = 0;
////
////        Integer [][] matrixArray = matrix.stream().map(e -> e.toArray(new Integer[0])).toArray(Integer[][] :: new);
////        int rowSize =  matrixArray[0].length;
////        int colSize = matrixArray.length;
////        System.out.println("r=" +rowSize + " c=" + colSize);
////        for (int row = 0; row < rowSize; row++) {
////            for(int col = 0; col < colSize; col++) {
//////                if (matrixArray[row][col] == 1) {
////                    // 4 corner case
////                    if (((row - 1 < 0) && (col -1 < 0)) && ((matrixArray[row+1][col]|matrixArray[row][col+1]|matrixArray[row+1][col+1])== 1) //(0,0)
////                            || ((row + 1 >= rowSize) && (col + 1 >= colSize)) && ((matrixArray[row -1][col]| matrixArray[row][col-1]| matrixArray[row-1][col-1]) == 1) //(m,n)
////                            || ((row + 1 >= rowSize) && (col - 1 < 0)) && ((matrixArray[row-1][col] | matrixArray[row][col+1] | matrixArray[row-1][col+1]) == 1) //(m,0)
////                            || ((row - 1 < 0) && (col + 1 >= colSize)) && ((matrixArray[row+1][col] | matrixArray[row][col-1] | matrixArray[row+1][col-1])) == 1) { //(0,n)
//////                        matrixArray[row][col] = 0;
//////                        count++;
////                    System.out.println("(" + row + ", " + col + ")");
////                    }
////                    // edge cases
////                    else if ((row - 1 < 0) //(0,y)
////                                || (row + 1 >= rowSize) // (m, y)
////                                || (col - 1 < 0) // (x, 0)
////                                || (col + 1 >= colSize)) { //(x, n)
//////                        matrixArray[row][col] = 0;
//////                        count++;
////                        System.out.println("(" + row + ", " + col + ")");
////                    }
////
////                    // middle cases
////                    else {
//////                        matrixArray[row][col] = 0;
//////                        count++;
////                        System.out.println("(" + row + ", " + col + ")");
////                    }
//////                    System.out.println("(" + row + ", " + col + ") Count: " + count);
//////                }
////            }
////        }
////
////        for (Integer[] row : matrixArray) {
////            for (int col: row){
////                System.out.print(row[col] + ", ");
////            }
////            System.out.println();
////        }
////        return count;
////    }
////
////    public static void main(String[] args) throws IOException {
////        List<int[]> lstA = new ArrayList<>();
////        lstA.add(new int[]{ 5, 2, 4, 6, 3, 7});
////        lstA.add(new int[]{ 5, 2, 4, 6, 3});
////        lstA.add(new int[]{ 5, 100, 2, 300, 3});
////        lstA.add(new int[]{ 5, 100, 200, 300, 3});
////        lstA.add(new int[]{ 5, 100, 500, 300, 3});
////        lstA.add(new int[]{ 5, 2, 4, 6, 3, 7});
////        lstA.add(new int[]{ 5, 4, 2, 6, 3, 7});
////        lstA.add(new int[]{ 5, 4, 2, 2, 6, 3, 7});
////        lstA.add(new int[]{ 5, 4, 2, 2, 2, 3, 7});
////        lstA.add(new int[]{ 5, 4, 2, 3, 4, 5, 7});
////        lstA.add(new int[]{ 5, 4, 5, 5, 2, 3, 7});
////        lstA.add(new int[]{ 1, 4, 5, 5, 2, 3, 1});
////        lstA.add(new int[]{ 1, 4, 5, 5, 2, 1, 1});
////        lstA.add(new int[]{ 1, 4, 5, 5, 2, 1, 1, 9, 3, 5, 3, 6});
////        lstA.add(new int[]{ 2, 5, 6, 6, 3, 2, 2, 9, 4, 6, 4, 7});
////        lstA.add(new int[]{ 2, 5, 6, 6, 3, 1, 2, 9, 4, 6, 4, 7});
////        lstA.add(new int[]{ 2, 5, 6, 6, 2, 1, 3, 9, 4, 6, 4, 7});
////        lstA.add(new int[]{ 2, 5, 6, 6, 2, 1, 2, 9, 4, 6, 4, 7});
////        lstA.add(new int[]{ 2, 1, 2, 1, 5, 5, 5, 5, 5, 5, 5, 5});
////        lstA.add(new int[]{ 2, 1, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5});
////        lstA.add(new int[]{ 2, 2, 2, 1, 5, 5, 5, 5, 5, 5, 5, 5});
////        lstA.add(new int[]{ 1, 4, 5, 5, 2, 1, 1});
////
////        List<Integer> ans = new ArrayList<>();
////        ans.add(5);
////        ans.add(8);
////        ans.add(400);
////        ans.add(400);
////        ans.add(400);
////        ans.add(5);
////        ans.add(5);
////        ans.add(5);
////        ans.add(4);
////        ans.add(6);
////        ans.add(6);
////        ans.add(6);
////        ans.add(5);
////        ans.add(3);
////        ans.add(5);
////        ans.add(5);
////        ans.add(5);
////        ans.add(4);
////        ans.add(2);
////        ans.add(3);
////        ans.add(3);
////        ans.add(5);
////
////        for (int i = 0; i< ans.size(); i++) {
////            System.out.println(ans.get(i) + ":" + Solution.solution(lstA.get(i)));
////        }
//////        List<List<Integer>> matrix = new ArrayList<>();
//////
//////        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1, 1)));
//////        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));
//////        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 0, 1)));
//////
//////        int res = countConnections(matrix);
//////        System.out.println(res);
////    }
////}
////
//////import java.io.*;
//////import java.math.*;
//////import java.security.*;
//////import java.text.*;
//////import java.util.*;
//////import java.util.concurrent.*;
//////import java.util.function.*;
//////import java.util.regex.*;
//////import java.util.stream.*;
//////import static java.util.stream.Collectors.joining;
//////import static java.util.stream.Collectors.toList;
//////
//////public class Main {
//////
//////    static void printMat(List<List<Integer>> matrix) {
//////        System.out.println("matrix:  ");
//////        for (List<Integer> lst: matrix) {
//////            for (int i : lst) {
//////                System.out.print(i +",");
//////            }
//////            System.out.println();
//////        }
//////    }
//////    static void printList(List<Integer> lst) {
//////        System.out.println("list:  ");
//////            for (int i : lst) {
//////                System.out.print(i +",");
//////            }
//////    }
//////
//////    // Complete the countSpecialElements function below.
//////    static int countSpecialElements(List<List<Integer>> matrix) {
//////        Set<Integer> resultSet = new HashSet<>();
//////        for (List<Integer> lst: matrix) {
//////            resultSet.add(Collections.max(lst));
//////            resultSet.add(Collections.min(lst));
//////        }
//////        for (int i = 0; i < matrix.get(0).size(); i++) {
//////            List<Integer> columnLst = new ArrayList<>();
//////            for (int j = 0; j < matrix.size(); j ++) {
//////                columnLst.add(matrix.get(j).get(i));
//////            }
//////            resultSet.add(Collections.max(columnLst));
//////            resultSet.add(Collections.min(columnLst));
//////        }
//////
//////        return resultSet.size();
//////    }
//////
//////    public static void main(String[] args) throws IOException {
//////
//////
//////        List<List<Integer>> matrix = new ArrayList<>();
//////        matrix.add(new ArrayList<>(Arrays.asList(1, 3, 4)));
//////        matrix.add(new ArrayList<>(Arrays.asList(5, 2, 9)));
//////        matrix.add(new ArrayList<>(Arrays.asList(8, 7, 6)));
//////
//////        int res = countSpecialElements(matrix);
//////        System.out.println(res);
//////
//////    }
//////}
////
////
//////import java.io.*;
//////import java.math.*;
//////import java.security.*;
//////import java.text.*;
//////import java.util.*;
//////import java.util.concurrent.*;
//////import java.util.function.*;
//////import java.util.regex.*;
//////import java.util.stream.*;
//////import static java.util.stream.Collectors.joining;
//////import static java.util.stream.Collectors.toList;
//////
//////
//////class Result {
//////
//////    /*
//////     * Complete the 'minOperations' function below.
//////     *
//////     * The function is expected to return a LONG_INTEGER.
//////     * The function accepts LONG_INTEGER n as parameter.
//////     */
//////    public static boolean isBinaryOfZero(List<Integer> binary) {
//////
//////        for (int i : binary) {
//////            if (i != 0)
//////                return false;
//////        }
//////        return true;
//////    }
//////
//////    private static List<Integer> getReversedBinary(long n){
//////        List<Integer> result = new ArrayList<>();
//////        while (n >= 1) {
//////            result.add((int)n % 2);
//////            n = n / 2;
//////        }
//////        return result;
//////    }
//////
//////    public static long minOperations(long n) {
//////        // Write your code here
//////
//////        List<Integer> reversedBinary = getReversedBinary(n);
//////        int count = 0;
//////        while(!isBinaryOfZero(reversedBinary)) {
//////            for (int i = 0; i < reversedBinary.size(); i++) {
//////                if (i == 0) {
//////                    reversedBinary.set(i, (reversedBinary.get(i) + 1) % 2);
//////                    count++;
//////                    continue;
//////                }
//////                if (reversedBinary.get(i -1) == 1 && isBinaryOfZero(reversedBinary.subList(0, i - 1))) {
//////                    reversedBinary.set(i, (reversedBinary.get(i) + 1) % 2);
//////                    count++;
//////                }
//////            }
//////        }
//////
//////        return count;
//////    }
//////
//////}
//////public class Main {
//////    public static void main(String[] args) throws IOException {
//////
//////        long n = 21;
//////
//////        long result = Result.minOperations(n);
//////        System.out.println(result);
//////
//////    }
//////}
////
//////import java.util.Stack;
//////
//////public class Main {
//////
////////    private static int power(int num, int pow) {
////////
////////        if (pow == 1)
////////            return num;
////////
////////        if (pow % 2 == 0) {
////////            return power(num, pow / 2) * power(num, pow / 2);
////////        }
////////
////////        else
////////            return power(num, pow /2) * power(num, pow/2) * num;
////////    }
//////
//////
////////    private static void sort(int [] list1, int i, int [] list2, int j) {
////////
////////        if (list1.length <= i && list2.length <= j)
////////            return;
////////
////////        if (list1.length == i && list2.length > j || list1[i] > list2[j] ){
////////            System.out.println(list2[j]);
////////            sort(list1, i, list2, j+1);
////////        }
////////
////////        else if (list2.length == j && list1.length > j || list1[i] < list2[j] ) {
////////            System.out.println(list1[i]);
////////            sort(list1, i+1, list2, j);
////////        }
//////
////////        if () {
////////            System.out.println(list1[i]);
////////            sort(list1, i+1, list2, j);
////////        }
////////
////////        else {
////////            System.out.println(list2[j]);
////////            sort(list1, i, list2, j+1);
////////        }
//////
//////        /*
//////        1st -> h1, h3, h4
//////        2nd -> h1, h3, h6
//////        //////////
//////        5 race -> 15
//////        3 race -> 9
//////        2 race (5/ 4) -> 6
//////        2 race (5/ 1)
//////
//////         */
//////
////////    }
//////
//////
//////    public static void main(String[] args) {
//////
////////        int arr[] = new int[] {10, 11, 12, 9 , 13, 5};
////////
////////        for (int i = 0; i < arr.length; i++) {
////////            int profit = -1;
////////            for (int j = i +1; j < arr.length; j++) {
////////                if (arr[i] < arr[j]) {
////////                    profit = arr[j];
////////                    break;
////////                }
////////            }
////////            System.out.println(profit);
////////        }
//////
////////        System.out.println(power(2, 10));
//////
////////        Stack<Integer> stack = new Stack<Integer>();
////////
////////        for (int e : arr) {
////////
////////            while (!stack.empty() && stack.peek() < e) {
////////                System.out.println(e);
////////                stack.pop();
////////            }
////////            stack.push(e);
////////        }
////////
////////        while(!stack.isEmpty()) {
////////            System.out.println(-1);
////////            stack.pop();
////////        }
//////
////////        int [] list1 = new int[] { 2, 5, 7, 9, 12, 14, 17};
////////        int [] list2 = new int[] { 3, 4, 8, 11, 15, 19};
////////        int [] result = new int[list1.length + list2.length];
////////        int i = 0, j = 0, k = 0;
////////
////////        sort(list1, 0, list2, 0);
//////
////////        for (; i < list1.length && j < list2.length ; k++) {
////////            if (list1[i] < list2[j]) {
////////                result[k] = list1[i];
////////                i++;
////////            }
////////            else {
////////                result[k] = list2[j];
////////                j++;
////////            }
////////        }
////////
////////        while(i < list1.length) {
////////            result[k] = list1[i];
////////            i++;
////////            k++;
////////        }
////////
////////        while(j < list2.length) {
////////            result[k] = list2[j];
////////            j++;
////////            k++;
////////        }
////////
////////        for (int e : result)
////////        System.out.println(e);
//////        System.out.println(TempEnum.Program.equals(null));
//////    }
//////
////////    private char[] permute (char [] arr) {
////////        char[] result = new char[][arr.length];
////////        if (arr.length == 1 )
////////            return arr;
////////
////////        else
////////            for (char ch : arr) {
////////                return ch
////////            }
////////    }
//////}
//////