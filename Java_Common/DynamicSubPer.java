import java.util.Scanner;
//percentage
public class DynamicSubPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        float sum=0;
        float a[] = new [n];
        String st[] = new [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of subject "+(i+1));
            a[i][0] = sc.nextLine();
            System.out.println("Enter the marks obtained out of 100 in "+a[i][0]+": ");
            a[i][1] = Float.toString(sc.nextFloat());
            if(Float.parseFloat(a[i][1])<0 || Float.parseFloat(a[i][1])>100)
            {
                System.out.println("\nInvalild input in subject "+a[i][0]+". Marks must be in range of 0 to 100\n");
                i--;
                continue;
            }
        }
        for(int i=0;i<n;i++)
        {
            sum += Float.parseFloat(a[i][1]);
        }
        float per = sum/n;
        System.out.println("Persentage obtained by the student "+name+" is: "+per);
    }
}
