//8	Write a program to show the use of nested try statements
// that emphasizes the sequence of checking for catch handler statements.
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        try {

            System.out.println("We are in outer try block");

            //-----------First inner try loop----------
            try {
                System.out.println("We are in 1st inner try block");
                int b = 5 / 0;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Normal Exception");
            }
            System.out.println("We are out of 1st inner try block");

            //----------Second inner try loop----------
            try {
                System.out.println("We are in 2nd inner try block");
                int a[] = new int[5];

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the index you want:-");
                int n = sc.nextInt();
                System.out.println(a[n]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("We are out of 2nd inner try block");

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("We are out of outer try block");

    }
}