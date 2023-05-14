import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of your choice: ");
        int n = sc.nextInt();
        if(n % 200 == 0){
            System.out.println("Year "+n+" is a Leap Year.");
        }
        else if(n % 4 == 0 && n % 100 != 0){
            System.out.println("Year "+n+" is a Leap Year.");
        }
        else{
            System.out.println("Year "+n+" is NOT a Leap Year.");
        }
    }
}
