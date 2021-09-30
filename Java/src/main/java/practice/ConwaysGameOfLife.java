package practice;

import java.util.ArrayList;
import java.util.List;

class Result {

    static void printDList(List<List<Integer>> lst) {
        System.out.println("list:  ");
        for (List<Integer> chL: lst) {
            for (int i : chL) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
    }

    /*
     * Complete the 'nextGeneration' function below.
     *
     * The function is expected to return a STRING of a 2d array (newline delimited) of 0 (dead) 1 (alive) cells.
     * The function accepts STRING startingBoard as parameter.
     *
     * Example Input: "0001000\n0001000\n0001000"
     * Example Return Value: "0000000\n0011100\n0000000"
     */
    public static String nextGeneration(String startingBoard) {

        List<List<Integer>> startingBoardInt = new ArrayList<>();
        startingBoardInt.add(new ArrayList<>());

        for (int i = 0, j = 0;i < startingBoard.length(); i++) {
            if (startingBoard.charAt(i) == '\n'){
                startingBoardInt.add(new ArrayList<>());
                j++;
            }
            else
                startingBoardInt.get(j).add(Character.getNumericValue(startingBoard.charAt(i)));
        }

        int[][] next = new int[startingBoardInt.size()][startingBoardInt.get(0).size()];

        for (int l = 1; l < startingBoardInt.size() - 1; l++)
        {
            for (int m = 1; m < startingBoardInt.get(0).size() - 1; m++)
            {

                int alive = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        alive += startingBoardInt.get(l + i).get(m + j);
                    }
                }

                alive -= startingBoardInt.get(l).get(m);

                if ((startingBoardInt.get(l).get(m) == 1) && (alive < 2)) {
                    next[l][m] = 0;
                }

                else if ((startingBoardInt.get(l).get(m) == 1) && (alive == 2 || alive == 3)) {
                    next[l][m] = 1;
                }

                else if ((startingBoardInt.get(l).get(m) == 1) && (alive >3)) {
                    next[l][m] = 0;
                }

                else if ((startingBoardInt.get(l).get(m) == 0) && (alive == 3)) {
                    next[l][m] = 1;
                }

                else {
                    next[l][m] = startingBoardInt.get(l).get(m);
                }
            }
        }



        String result = null;
        for (int i = 0; i < startingBoardInt.size(); i++)
        {
            for (int j = 0; j < startingBoardInt.get(0).size(); j++)
            {
                if (next[i][j] == 0) {
                    if (result == null)
                        result = "0";
                    else
                        result = result+"0";
                }
                else {
                    if (result == null)
                        result = "1";
                    else
                        result = result+"1";
                }

            }
            result = result + "\n";
        }

        return result;
    }
}

public class ConwaysGameOfLife {

    public ConwaysGameOfLife() {
        String startingBoard = "0100010\n0011100\n0011100\n0011100\n0100010";

        String result = Result.nextGeneration(startingBoard);

        System.out.println(result);
    }
}
