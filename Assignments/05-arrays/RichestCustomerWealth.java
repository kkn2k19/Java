// https://leetcode.com/problems/richest-customer-wealth/description/?source=submission-ac
// 1672. Richest Customer Wealth

// import java.util.Arrays;
// import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int bal = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                bal += accounts[i][j];
            }
            if (bal > max) {
                max = bal;
            }
        }
        return max;
    }
}

/*
 * Output --
 * 
 * 17
 */