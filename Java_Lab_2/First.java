//Write a program to create a “distance” class with methods where distance is displayed in terms of feet and inches, 
//how to create objects of a class.
import java.util.Scanner;

class Distance{
    public double meterToFeets(float meters){
        return meters*3.2808399;
    }
    public double cmToInches(float cm){
        return cm*0.39370079;
    }
}
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter distance in metric system");
        System.out.println("First \"METERS\" then \"CENTIMETERS\"");
        System.out.println("Meters:");
        int m = sc.nextInt();
        System.out.println("Centimeters:");
        int cm = sc.nextInt();
        Distance d1 = new Distance();
        System.out.print("Feets: ");
        System.out.print(d1.meterToFeets(m)+"\t");
        System.out.print("Inches: ");
        System.out.println(d1.cmToInches(cm));
    }
}