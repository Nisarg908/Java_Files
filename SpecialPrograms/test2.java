import java.util.Scanner;

public class test2 {
    static void search(int aim, int arr[]){
        int low = 0;
        int high = arr.length-1;
        int counter = 0;
        int mid = (low+high)/2;
        while(arr[low] != arr[high]){
            if(arr[mid]==aim && mid!=0 && mid!=(arr.length-1)){
                if(arr[mid]>arr[mid-1]){
                    low = mid;
                    if(counter!=0){
                        mid += counter;
                        if(arr[mid] == arr[mid+1]){
                            mid=mid+((high-mid)/2);
                            high=mid;
                            continue;
                        }
                    }
                }
                else if(arr[mid]<arr[mid+1]){
                    high = mid;
                }
                else if(arr[mid] == arr[mid-1]){
                    mid=low+((mid-low)/2);
                    low=mid;
                    counter++;
                    if(arr[0]==aim){
                        low=0;
                    }
                    continue;
                }
            }
            else if(aim>arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            mid = (low+high)/2;
        }
        System.out.print("["+low+","+high+"]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the sored array in assending order: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            if(i!=0 && nums[i]<nums[i-1]){
                System.out.println("\nEntered element is greater than it's preceding element. Please enter in correct order.");
                System.out.println("\nEnter the sored array in assending order: ");
                i=-1;
            }
        }
        System.out.print("Target: ");
        int target = sc.nextInt();
        System.out.print("Output: ");
        search(target,nums);
    }
}

//Tapan's code here:
