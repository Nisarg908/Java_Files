import java.util.Scanner;

public class pract14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the list: ");
        int n = sc.nextInt();
        System.out.print("Enter the list of number to be sorted: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}