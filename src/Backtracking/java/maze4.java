package Backtracking.java;

public class maze4 {
    public static void main(String[] args) {
        int col = 2;
        int row = 2;
        boolean[][] isValid = new boolean[row][col]; // use primitive boolean
        print(0, 0, col - 1, row - 1, " ", isValid);
    }

    private static void print(int sc, int sr, int ec, int er, String s, boolean[][] isValid) {
        // out of bounds
        if (sc < 0 || sr < 0 || sc > ec || sr > er) {
            return;
        }

        // already visited
        if (isValid[sr][sc]) {
            return;
        }

        // reached destination
        if (sc == ec && sr == er) {
            System.out.println(s);
            return;
        }

        // mark visited
        isValid[sr][sc] = true;

        // explore all 4 directions
        print(sc + 1, sr, ec, er, s + "R", isValid); // right
        print(sc, sr + 1, ec, er, s + "D", isValid); // down
        print(sc - 1, sr, ec, er, s + "L", isValid); // left
        print(sc, sr - 1, ec, er, s + "U", isValid); // up

        // backtrack
        isValid[sr][sc] = false;
    }
}
