import java.util.Scanner;

public class pract7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String[] arr= new String[str.length()];
        int k=0;
        arr[0]="";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                arr[k]+=str.charAt(i);
            }
            else if(str.charAt(i)==' ' && str.charAt(i+1) != ' ') {
                k++;
                arr[k]="";
            }
        }
    
        int count=0;
        for(int j=0;j<k+1;j++){
            if(Character.isUpperCase(arr[j].charAt(0))){
                count++;
            }
        }
        System.out.println("\nThe count of number of words starting with CAPITAL Letter in the inputed string is: "+count);
    }
}
