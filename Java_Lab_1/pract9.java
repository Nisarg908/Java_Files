import java.util.Scanner;

public class pract9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to build its pyramid: ");
        String st = sc.nextLine();
        int n = st.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // st.substring(0,i+1);
            for(int k=0;k<=i;k++){
                System.out.print(st.charAt(k));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
