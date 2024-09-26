// 13.04.2024
// Find Ncr & Npr 
// Ncr = fact(n)/(fact(n-r) * fact(r))
// Npr = fact(n)/fact(n-r)

import java.util.Scanner;

public class Find_Ncr_Npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        float ncr = (float) fact(n) / (fact(n - r) * fact(r));
        float npr = (float) fact(n) / fact(n - r);
        System.out.println("Ncr : " + ncr + "\nNpr : " + npr);
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}

/*
 * Output --
 * 
 * Provide n and r : 5 2
 * Ncr : 10.0
 * Npr : 20.0
 */