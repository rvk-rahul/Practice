package practice.others;

import java.util.ArrayList;
import java.util.List;

public class ConwaysGameOfLife {

    /*
     * Complete the 'nextGeneration' function below.
     *
     * The function is expected to return a STRING of a 2d array (newline delimited) of 0 (dead) 1 (alive) cells.
     * The function accepts STRING startingBoard as parameter.
     *
     * Example Input: "0001000\n0001000\n0001000"
     * Example Return Value: "0000000\n0011100\n0000000"
     */

    public int countLiveNeighbours(List<List<Integer>> startingBoard, int row, int col) {

        int live = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if ((row - i == row && col - j == col) || row + i < 0 || col + j < 0 || row + i >= startingBoard.size() || col + j >= startingBoard.get(row).size() )
                    continue;
                if (startingBoard.get(row+i).get(col+j) == 1)
                    live++;

            }
        }

        return live;
    }

    public String nextGeneration(String startingBoard) {

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

        for (int row = 0; row < startingBoardInt.size() ; row++)
        {
            for (int col = 0; col < startingBoardInt.get(row).size() ; col++)
            {

                int alive = countLiveNeighbours(startingBoardInt, row, col);

                if ((startingBoardInt.get(row).get(col) == 1) && (alive < 2)) {
                    next[row][col] = 0;
                }

                else if ((startingBoardInt.get(row).get(col) == 1) && (alive == 2 || alive == 3)) {
                    next[row][col] = 1;
                }

                else if ((startingBoardInt.get(row).get(col) == 1) && (alive >3)) {
                    next[row][col] = 0;
                }

                else if ((startingBoardInt.get(row).get(col) == 0) && (alive == 3)) {
                    next[row][col] = 1;
                }

                else {
                    next[row][col] = startingBoardInt.get(row).get(col);
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

    public ConwaysGameOfLife() {
        System.out.println("##########################################");
        System.out.println("Conways Game of Life:");
//        String startingBoard = "0100010\n0011100\n0011100\n0011100\n0100010";
//        String startingBoard = "1001\n0111\n1001";
        String startingBoard = "1010100100\n0010010001\n1001010110\n1010100101\n0000000000";

        String result = nextGeneration(startingBoard);
        System.out.println(result);
        System.out.println("##########################################");
    }
}
