import java.util.Scanner;

public class pract8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vf = 0;
        // String q = "continue";
        while(true){
            int v=0;
            System.out.print("\nEnter the string: ");
            String str = sc.nextLine();
            String st = str.toLowerCase();

            for(int i=0;i<st.length();i++){
                if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u'){
                    v++;
                    vf++;
                }
            }
            System.out.println("\nCount of number of vowels in the entered string: "+v);
            System.out.println("Count of number of vowels entered in all sentences: "+vf);
            System.out.println("\nDo you want to still keep counting vowels? If yes enter continue else type quit: ");
            String dec = sc.nextLine();
            if(dec.equalsIgnoreCase("quit")){
                break;
            }
        }
    }
}