import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int i=0;
        // char[] ch = str.toCharArray();
        for(char c : str.toCharArray()){
            i++;
        }
        System.out.println("Length of the given string is: "+i);
    }
}
