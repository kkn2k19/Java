public class CountNums {
    public static void main(String[] args) {
        int n = 25536;
        int count = 0;
        while(n>0){
            int d = n%10;
            if (d == 5){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
