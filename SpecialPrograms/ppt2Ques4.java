import java.util.Scanner;

public class ppt2Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the size of the array nums: ");
            int n = sc.nextInt();
            if(n<1 || n>5*Math.pow(10, 5))
            {
                System.out.println("Enter the size in range 1 to 5x10^5\n");
                continue;
            }
            long nums[] = new long[n];
            System.out.println("Enter the integer elemets of array nums: ");
            for(int i =0;i<n;i++){
                nums[i] = sc.nextLong();
                if(nums[i]<Math.pow(-2, 31) || nums[i]>Math.pow(2,31)-1)    
                {
                    System.out.println("Enter the integer in range -2^31 to 2^31-1");
                    i=i-1;
                    continue;
                } 
            }
            for(int i=1;i<=n+1;i=i*2)
            {
                int c=0;
                for(int j=0;j<n;j++)
                {
                    if(i==nums[j])
                    {
                        c=1;
                        break;
                    }
                }
            
                if(c!=1)
                {
                    System.out.println("Smallest positive integer is: "+i);
                    break;
                }
            }
            break;
        }
    }
}
