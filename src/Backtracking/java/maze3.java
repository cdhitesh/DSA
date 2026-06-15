package Backtracking;

public class maze3 {
        public static void main(String[] args) {
            int col = 3;
            int row = 4;
            int[][] maze = {{1,0,1,1},
                           {1,1,1,1},
                           {1,1,0,1}};
            print(0, 0, col - 1, row - 1, " ",maze);
        }

        private static void print(int sc, int sr, int ec, int er, String s,int[][] maze) {
            // out of bounds
            if (sc < 0 || sr < 0 || sc > ec || sr > er) {
                return;
            }
            if (sr==er && sc==ec){
                System.out.println(s);
                return;
            }

            if (maze[sr][sc]==0) return;
            // already visited
            if (maze[sr][sc]==-1) {
                return;
            }

            // mark visited
            maze[sr][sc] = -1;

            // explore all 4 directions
            print(sc + 1, sr, ec, er, s + "R", maze); // right
            print(sc, sr + 1, ec, er, s + "D", maze); // down
            print(sc - 1, sr, ec, er, s + "L", maze); // left
            print(sc, sr - 1, ec, er, s + "U", maze); // up

            // backtrack
            maze[sr][sc] = 1;
        }
    }
