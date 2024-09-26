// https://leetcode.com/problems/matrix-diagonal-sum/

// 1572. Matrix Diagonal Sum

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        System.out.println(diagonalSum(arr));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if ((i == j) || (i + j == mat[0].length - 1)) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}

/*
 * Outputs --
 * 
 * 8
 */
