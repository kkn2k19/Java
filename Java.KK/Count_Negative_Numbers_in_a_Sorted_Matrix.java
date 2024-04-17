// 17.04.2024
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
// 1351. Count Negative Numbers in a Sorted Matrix

public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 },
        };
        System.out.println(countNegative(grid));
    }

    static int countNegative(int[][] grid) {
        int count =0;
        for(int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[0].length; j++){
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

/*
 * Output -- 
 * 
 * 8
 */
