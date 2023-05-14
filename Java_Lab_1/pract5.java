import java.util.Scanner;

public class pract5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,n3,max;
        System.out.print("Enter the 1st number: ");
        n1 = sc.nextFloat();
        System.out.print("Enter the 2nd number: ");
        n2 = sc.nextFloat();
        System.out.print("Enter the 3rd number: ");
        n3 = sc.nextFloat();
        max=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println();
        System.out.println("The max of three numbers is: "+max);
    }
}
