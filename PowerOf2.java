public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(checkPower(5));
    }

    static boolean checkPower(int n){
        int count = 0;
        while (n > 0) {
            int d = n&1;
            if (d == 1){
                count++;
            }
            if (count >1){
                return false;
            }
            n = n>>1;
        }
        return true;
    }
}