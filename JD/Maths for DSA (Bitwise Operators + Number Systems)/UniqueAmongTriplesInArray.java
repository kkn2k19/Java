// If an Array is given in which elements are appearing 3 times only 1 element is one time, find it?
// arr[] = {2,2,3,2,7,8,7,7,8,8}

//NOT COMPLETED YET !!!

public class UniqueAmongTriplesInArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 8, 7, 7, 8, 8};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        System.out.println(sum);
        return (sum % 3);
    }
}