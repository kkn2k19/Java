import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextInt();
        // float num = input.nextFloat();
        // int num = (int)input.nextFloat(); // narrow conversion or lossy conversion
        // System.out.println(num);

        // type casting
        // int num = (int)(67.56f);
        // System.out.println(num);

        // // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a); // 257 % 256 = 1 // byte stores till 256 after that it
        // stores remainder

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;

        // System.out.println(d);

        // byte b = 50;
        // b = (b * 2); ///error as * will give int but we have stored it in byte so we
        // have to either change the datatype(int) or typeCast it to (byte)

        // int number = 'A';
        // System.out.println(number);

        // java follows unicode for character types we can print any language
        // System.out.println("नमस्कार");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
}
