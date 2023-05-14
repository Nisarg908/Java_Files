import java.util.Scanner;

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
        System.out.print(d1.metersToFeets(m)+"\t");
        System.out.print("Inches: ");
        System.out.println(d1.centimetersToInches(cm));
    }
}
class Distance {
    public double metersToFeets(int meters){
        return (meters*3.2808399); 
    }
    public double centimetersToInches(int cm){
        return(cm*0.39370079);
    }
}