import java.util.Scanner;

public class pract10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max horizontal stars needed in diamond : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // st.substring(0,i+1);
            for(int k=0;k<=i;k++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
