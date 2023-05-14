import java.util.Scanner;
public class Seventh_3 {
    static int returnMax(int n1,int n2){
        int max = (n1>n2)?n1:n2;
        return max; 
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 int numbers to compare: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Maximum among "+a+" & "+b+" is: "+returnMax(a,b));
    } 
}