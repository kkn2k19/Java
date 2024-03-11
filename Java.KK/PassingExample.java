public class PassingExample {
    public static void main(String[] args) {
        String name = "KARAN KUMAR NONIA";
        greet(name);
    }

    // in java there is no pass by reference here only pass by value happens not like c/c++ where both happens

    static void greet(String naam) {
        naam = "chandanOP";
        System.out.println(naam);
    }
    
}