public class Seventh_2 {
    String s1 = "OOP";
    public void passByReference(Seventh_2 r){
        r.s1 = "Java";
    }
    public static void main(String[] args) {
        Seventh_2 r = new Seventh_2();
        System.out.println("\nBefore: "+(r.s1));
        r.passByReference(r);
        System.out.println("After: "+(r.s1));
        System.out.println();
    }
}
