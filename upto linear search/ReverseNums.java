public class ReverseNums {
    public static void main(String[] args) {
        int n = 23597;
        int rev = 0;
        while(n>0){
            int d = n%10;
            rev = 10*rev +d;
            n /= 10;
        }
        System.out.println(rev);
    }
}
