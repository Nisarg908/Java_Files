import java.util.Scanner;

public class pract6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v=0,c=0;
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String st = str.toLowerCase();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u'){
                v++;
            }
            else if(st.charAt(i)>'a' && st.charAt(i)<='z'){
                c++;
            }
        }
        System.out.println("Number of vowels are: "+v);
        System.out.println("Number of consonents are: "+c);
    }
}
