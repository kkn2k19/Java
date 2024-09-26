// https://leetcode.com/problems/richest-customer-wealth

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(maximumWealth(accounts));
    }

    // static int maximumWealth(int[][] accounts) {
    //     // customer = row
    //     // account = col
    //     int max = Integer.MIN_VALUE;
    //     for (int customer = 0; customer < accounts.length; customer++) {
        // when you start a new col, take a new sum for that row
    //         int bal = 0;  // balance
    //         for (int account = 0; account < accounts[customer].length; account++) {
    //             bal += accounts[customer][account];
    //         }
               // now we have sum of accounts of person
               // check with overall ans
    //         if (bal > max) { 
    //             max = bal;
    //         }
    //     }
    //     return max;
    // }
    
    static int maximumWealth(int[][] accounts) {
        // customer = row
        // account = col
        int max = Integer.MIN_VALUE;
        for (int[] customer : accounts) {
            int bal = 0;  // balance
            for (int account : customer) {
                bal += account;
            }
            if (bal > max) { 
                max = bal;
            }
        }
        return max;
    }
}