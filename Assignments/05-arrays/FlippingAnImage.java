// https://leetcode.com/problems/flipping-an-image/

// 832. Flipping an Image

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 }
        };
        int[][] arr = new int[image.length][image[0].length];
        arr = flipAndInvertImage(image);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = image[i][cols - j - 1];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}

/*
 * Outputs --
 * 
 * 1 1 0 0
 * 0 1 1 0
 * 0 0 0 1
 * 1 0 1 0
 */