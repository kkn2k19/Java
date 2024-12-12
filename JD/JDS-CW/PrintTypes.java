import java.text.SimpleDateFormat;
import java.util.Date; // Import the Date class

public class PrintTypes {
    public static void main(String[] args) {
        // print()
        System.out.print("KARAN");
        System.out.print("KUMAR");
        System.out.print("NONIA");

        // println()
        System.out.println("\nKKN");
        System.out.println("THE");
        System.out.println("GAMER");

        // printf()
        System.out.printf("%d\n", 2);
        System.out.printf("%f\n", 2.3f);

        // format()
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        String str = dt.format(new Date());
        System.out.println("Formatted Date : " + str);
    }
}