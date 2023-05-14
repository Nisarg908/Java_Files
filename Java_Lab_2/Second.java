import java.util.Scanner;

class distance{
    double feets;
    double inches;
    distance(){
        feets = 2;
        inches = 4;
    }
    distance(int m, int cm){
        feets=(m*3.2808399);
        inches=(cm*0.39370079);
    }
    distance(distance d){
        this.feets = d.feets;
        this.inches = d.inches;
    }
}

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter distance in metric system");
        System.out.println("First \"METERS\" then \"CENTIMETERS\"");
        System.out.println("Meters:");
        int m = sc.nextInt();
        System.out.println("Centimeters:");
        int cm = sc.nextInt();
        distance d1 = new distance(m,cm);
        System.out.print("d1-Feets: ");
        System.out.print(d1.feets+"\t");
        System.out.print("Inches: ");
        System.out.println(d1.inches);
        System.out.println();
        distance d2 = new distance();
        d2.feets = d1.feets;
        d2.inches = d1.inches;
        System.out.print("d2-Feets: ");
        System.out.print(d2.feets+"\t");
        System.out.print("Inches: ");
        System.out.println(d2.inches);
        System.out.println();
        distance d3 = new distance(d1);
        System.out.print("d3-Feets: ");
        System.out.print(d3.feets+"\t");
        System.out.print("Inches: ");
        System.out.println(d3.inches);
        System.out.println();
    }
}