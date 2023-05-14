import java.util.Arrays;
import java.util.Scanner;
public class Question11 {
    public static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        try {
            while (start <= end) {
            //System.out.println(arr[target]);
                if ((target < arr[(start + (end- start) / 2)])) {
                    end = (start + (end - start)/ 2) - 1;
                } else if ((target > arr[(start+ (end - start) / 2)])) 
                {
                    start = (start + (end -start) / 2) + 1;
                } else if (target == arr[(start+ (end - start) / 2)]) 
                { 
                    return (start + (end -start) / 2);
                }
            }
            return -1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrays out of bound exception : " + e);
            return -1;
        }
    }
    static void sort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++)   
        {
            temp=0;
            for (int j = 0; j <arr.length-(i+1); j++) {
                if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Entering the Binary Search");
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println(BinarySearch(arr,target));
    }
}