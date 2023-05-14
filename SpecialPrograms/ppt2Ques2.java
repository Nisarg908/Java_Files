import java.util.Scanner;

public class ppt2Ques2 {
    static void search(long aim, long arr[]){
        int low=0;
        int high=arr.length -1;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == aim){
                low = i;
                break;
            }
        }
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] == aim){
                high = i;
                break;
            }
        }
        if(arr[low]!=aim){
            low = high =- 1;
        }
        System.out.println("["+low+","+high+"]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            if(n<0 || n>5*Math.pow(10, 5))
            {
                System.out.println("Enter the size in range 0 to 5x10^5\n");
                continue;
            }
            long nums[] = new long[n];
            System.out.println("Enter the integer elemets of array nums: ");
            for(int i =0;i<n;i++){
                nums[i] = sc.nextLong();
                if(nums[i]<Math.pow(-2, 31) || nums[i]>Math.pow(2,31)-1)    
                {
                    System.out.println("Enter the integer in range -2^31 to 2^31-1");
                    i=-1;
                    continue;
                } 
                if(i!=0 && nums[i]<nums[i-1]){
                    System.out.println("\nEntered element is greater than it's preceding element. Please enter in correct order.");
                    System.out.println("\nEnter the sorted array in assending order: ");
                    i=-1;
                }
            }
            System.out.print("Target: ");
            long target = sc.nextLong();
            if(target<Math.pow(-2, 31) || target>Math.pow(2,31)-1)    
            {
                System.out.println("Enter the integer target in range -2^31 to 2^31-1");
                continue;
            }
            
            System.out.print("Output: ");
            search(target,nums);
            break;
        }
    }
}