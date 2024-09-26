// 07.04.2024
// Calculate Batting Average

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide runs, matches, not-outs : ");
        int runs = sc.nextInt();
        int matches = sc.nextInt();
        int notouts = sc.nextInt();

        float average = averageRuns(runs, matches, notouts);
        if (average == -1) {
            System.out.print("NA");
        } else {
            System.out.print(average);
        }
    }

    static float averageRuns(int runs, int matches, int notouts) {
        int out = matches - notouts;

        if (out == 0) {
            return -1;
        }

        float average = (float) runs / out;
        return average;
    }
}

/*
 * Output --
 * 
 * Provide runs, matches, not-outs : 1000 50 4
 * 21.73913
 */