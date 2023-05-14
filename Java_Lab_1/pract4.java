import java.util.Scanner;

public class pract4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The name of the student: ");
        String name = sc.nextLine(); 
        float a[] = new float[6];
        String s[] = {"DMS","DS","MPI","DECO","JAVA","BA"};
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter the marks obtained out of 100 in "+s[i]+": ");
            a[i] = sc.nextFloat();
            if(a[i]<0 || a[i]>100)
            {
                System.out.println("\nInvalild input in subject "+s[i]+". Marks must be in range of 0 to 100\n");
                i--;
                continue;
            }
        }
        float per = (a[0]+a[1]+a[2]+a[3]+a[4]+a[5])/6;
        System.out.println("\nPercentage obtained by the student "+name+" is: "+per);
    }
}
