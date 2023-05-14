import java.util.Scanner;

public class pract12 {
    static void f1 (float a){
        System.out.println("Area of the circle is: "+(a*a*3.14));
    }
    static void f1 (double m){
        System.out.println("Area of the square is: "+(m*m));
    }
    static void f1 (float a,float b){
        System.out.println("Area of the rectangle is: "+(a*b));
    }
    static void f1 (double a,double b){
        System.out.println("Area of the triangle is: "+(1/2f*a*b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1->Area of circle: ");
        System.out.println("2->Area of square: ");
        System.out.println("3->Area of the rectangle: ");
        System.out.println("4->Area of the triangle: ");
        System.out.print("Enter your choice: ");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.print("Enter the radius of the circle: ");
                float r = sc.nextFloat();
                f1(r);
                break;
            case 2:
                System.out.print("Enter the side of the square: ");
                double a = sc.nextDouble();
                f1(a);
                break;
            case 3:
                System.out.print("Enter the length of rectangle: ");
                float l = sc.nextFloat();
                System.out.print("Enter the bredth or width of rectangle: ");
                float w = sc.nextFloat();
                f1(l,w);
                break;
            case 4:
                System.out.print("Enter the height of rectangle: ");
                double h = sc.nextDouble();
                System.out.print("Enter the base of rectangle: ");
                double b = sc.nextDouble();
                f1(h,b);
                break;
            default:
                System.out.println("Invalid input please run the code again quitting....");
        }
    }
}
