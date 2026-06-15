import java.util.Scanner;

public class diagonalmatrixsum {
    public static int diagnoalsum(int[][] matrix){
        int sum = 0 ;
        for (int i =0 ; i< matrix.length;i++){
//            pd
            sum += matrix[i][i];
//            sd
            if (i != matrix.length - i - 1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix ={{1 ,2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};
        System.out.println(diagnoalsum(matrix));
    }
}
