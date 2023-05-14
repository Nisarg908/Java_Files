import java.util.Scanner;

public class LengthOfString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String st = str+"\n";
        int i=0;
        while(st.charAt(i) != '\n'){
            i++;
        }
        System.out.println("Length of the given string is: "+i);
    }
}
