public class Seventh_1 {
    public static void change(String x){            //Imp stactic method can call only stactic methods and variables
        x = "Java";
    }
    public static void main(String[] args) {
        String x = "OOP";
        System.out.println("\nBefore: "+x);
        change(x);
        System.out.println("After: "+x);
        System.out.println();
    }
}
