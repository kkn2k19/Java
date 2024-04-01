
import java.util.*;
import java.util.Arrays;
import java.math.BigInteger;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        ArrayList<Integer> result = new ArrayList<>(num.length);;
        result = addToArrayForm(num, k);
        System.out.println("Input: num = " + Arrays.toString(num) + ", k = " + k);
        System.out.println("Output: " + result);
    }

    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        // int sum = 0;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < num.length; i++) {
            // sum = sum * 10 + num[i];
            sum = sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(num[i]));
        }
        sum = sum.add(BigInteger.valueOf(k));

        ArrayList<Integer> list = new ArrayList<>(num.length);
        if (sum.equals(BigInteger.ZERO)) {
            list.add(0);
        } else {
            while (!sum.equals(BigInteger.ZERO)) {
                // int digit = (int)sum % 10;
                // list.add(0, digit);
                // sum /= 10;
                BigInteger[] divRem = sum.divideAndRemainder(BigInteger.TEN);
                list.add(0, divRem[1].intValue());
                sum = divRem[0];
            }
        }

        return list;
    }
}
