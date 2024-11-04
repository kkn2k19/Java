// Find no. of Digits of n in base b.

public class NoOfDigitsInBaseBofN {
    public static void main(String[] args) {
        int num = 10;
        int base = 2;

        System.out.println(digits(num,base));
    }

    static int digits(int num, int base){
        return ((int)(Math.log(num)/Math.log(base))+1);
    }
}


//OUTPUT ---
//
//4