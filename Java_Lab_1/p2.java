import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which prime numbers are to be calculated: ");
        int n = sc.nextInt();
        int i=2;
        System.out.println("The required prime numbers are:");
        while(i<=n)
        {  
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    i++;
                    break;
                }
            }
            if(i%3!=0 || i==3){
                System.out.println(i);
            }
            i++;
        }
    }
}
