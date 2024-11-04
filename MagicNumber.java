public class MagicNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(magic(n));
    }
    static int magic(int n) {
        int sum = 0;
        int i = 1;
        do {
            int d = n&1;
            sum += d * Math.pow(5, i);
            n = n >> 1;
            i++;
        } while (n!=0);
        return sum;
    }
}