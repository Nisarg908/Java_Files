import java.util.Scanner;

public class pract3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st int: ");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd int: ");
        int y = sc.nextInt();
        System.out.println();
        System.out.println("Sum = "+x+" + "+y+" = "+(x+y));
        System.out.println("Difference = "+x+" - "+y+" = "+(x-y));
        System.out.println("Multiplication = "+x+" x "+y+" = "+(x*y));
        System.out.println("Division = "+x+" / "+y+" = "+((float)x/y));
    }
}
