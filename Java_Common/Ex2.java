import java.util.Scanner;
//km to miles
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double k = sc.nextDouble();
        double m = k*0.621371;
        System.out.print("Entered Distance in miles is: "+m+" miles");
    }
}
