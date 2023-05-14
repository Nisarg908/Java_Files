import java.util.Scanner;
import java.lang.Math;

public class pract13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scientific Operations:");
        System.out.println("1-> Square Root");
        System.out.println("2-> Tangent tan(x) x in radians");
        System.out.println("3-> Sine sin(x) x in radians");
        System.out.println("4-> Cosine cos(x) x in radians");
        System.out.println("5-> Degree to Radian");
        System.out.println("6-> display any random number between 0 and 1, 0 included");
        System.out.println("7-> Log to the base 10");
        int n = sc.nextInt();
        float num;
        switch (n){
            case 1:
                System.out.println("Enter the number");
                num = sc.nextFloat();
                System.out.println("Sq.root = "+Math.sqrt(num));
                break;
            case 2:
                System.out.println("Enter the angle in radians:");
                num = sc.nextFloat();
                System.out.println("Tan(x) = "+Math.tan(num));
                break;
            case 3:
                System.out.println("Enter the angle in radians:");
                num = sc.nextFloat();
                System.out.println("Sin(x) = "+Math.sin(num));
                break;
            case 4:
                System.out.println("Enter the angle in radians:");
                num = sc.nextFloat();
                System.out.println("Cos(x) = "+Math.cos(num));
                break;
            case 5:
                System.out.println("Enter the angle in degree to radians:");
                num = sc.nextFloat();
                System.out.println("Angle in radians = "+Math.toRadians(num));
                break;
            case 6:
                System.out.println("The random number is :"+Math.random());
                break;
            case 7:
                System.out.println("Enter the number to find log base 10: ");
                num = sc.nextFloat();
                System.out.println("The log of the number is: "+Math.log10(num));
                break;
        }
    }
}
