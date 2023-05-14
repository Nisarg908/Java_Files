import java.util.Scanner;

public class pract11Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to build its pyramid: ");
        String st = sc.nextLine();
        System.out.print("Enter the max horizontal length needed in diamond : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            if(i%2==0){
                // for(int j=0;j<n-i-1;j++){
                //     System.out.print(" ");
                // }
                // st.substring(0,i+1);
                for(int k=0;k<=i;k++){
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
            else{
                // for(int j=0;j<n-i-1;j++){
                //     System.out.print(" ");
                // }
                // st.substring(0,i+1);
                // if(st.length()<n){
                int m = 0;
                for(int k=0;k<=i;k++){
                    System.out.print(st.charAt(m));
                    System.out.print(" ");
                    m++;
                    if(st.length()<n){
                        if(m==st.length()){
                            m=0;
                        }
                    }
                }
                // else{
                //     for(int k=0;k<=i;k++){
                //         System.out.print(st.charAt(k));
                //         System.out.print(" ");
                //     }
                // }
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            if(i%2!=0){
                for(int k=i;k>0;k--){
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
            else{
                int m=0;
                for(int k=i;k>0;k--){
                    System.out.print(st.charAt(m));
                    System.out.print(" ");
                    m++;
                    if(st.length()<n){
                        if(m==st.length()){
                            m=0;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
