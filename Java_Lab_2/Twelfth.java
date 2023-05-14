import java.util.Scanner;

public class Twelfth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plese enter 1st String: ");
        String s = sc.nextLine();
        String temp = "";
        for(int i=0;i<s.length();i++){
            temp = temp + s.charAt(s.length()-1-i);
        }
        System.out.println(temp);
        System.out.print("\nPlease enter 2nd String: ");
        String r = sc.nextLine();
        if(temp.equalsIgnoreCase(r)){
            System.out.println("\nStrings are in rotation of each other.");
        }
        else{
            System.out.println("\nString are NOT in rotation of each other");
        }
    }
}