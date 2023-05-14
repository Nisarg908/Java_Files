import java.util.Scanner; 

public class Question7 { 
    public static void main(String[] args){ 
        int x,y; 
        Scanner input=new Scanner(System.in); 
        try { 
            System.out.print("Enter first integer : "); 
            x=input.nextInt();
            System.out.print("Enter second integer : "); 
            y=input.nextInt();
            System.out.println(x + " / " + y +" = " + (x/y)); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("Denominator Cannot be Zero while Integer Division"); 
        }
    }
} 