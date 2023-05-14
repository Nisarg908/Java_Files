import java.util.Scanner;

public class pract2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for 1st n prime numbers to be printed: ");
        int n = sc.nextInt();
        int i=2;
        System.out.println("The required prime numbers are:");
        while(n>0){
            int count = 1;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count = 0;
                    break;
                }
                else{
                    count=1;
                }
            }
            if(count == 1){
                System.out.println(i);
                n--;
            }
            i++;
        }
    }
}
