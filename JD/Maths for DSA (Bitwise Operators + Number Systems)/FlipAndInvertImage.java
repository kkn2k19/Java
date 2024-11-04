// 832. Flipping an Image
// https://leetcode.com/problems/flipping-an-image/description/

//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//To flip an image horizontally means that each row of the image is reversed.
//        For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//        For example, inverting [0,1,1] results in [1,0,0].
//
//Example 1:
//
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image  = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
//        int[][] arr = flipAndInvertImageM1(image);
        int[][] arr = flipAndInvertImageM2(image);
        System.out.println(Arrays.deepToString(arr));
    }

    static int[][] flipAndInvertImageM2(int[][] image){
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < (image[i].length + 1) / 2; j++){
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[j].length - 1 - j] ^ 1;
                image[i][image[j].length - 1 - j] = temp;
            }
        }
        return image;
    }

    static int[][] flipAndInvertImageM1(int[][] image){
        int rows = image.length;
        int cols = image[0].length;
        int[][] arr = new int[rows][cols];

        // reversing
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                arr[i][j] = image[i][cols-1-j];      // each row is just reversed so i will remain same but j will be changed it will start from end // cols-1-j.
            }
        }

        // inversion
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (arr[i][j] == 0){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}


//OUTPUT ---
//
//        [[1, 0, 0], [0, 1, 0], [1, 1, 1]]