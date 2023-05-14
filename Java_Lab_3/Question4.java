import java.io.*;
import java.util.Scanner;

class Student{
    String Roll_No;
    String Name;
    String Branch;
    String Year;
    Student(String Roll_No, String Name, String Branch, String Year){
        this.Roll_No = Roll_No;
        this.Name = Name;
        this.Branch = Branch;
        this.Year = Year;
    }
    public String toString(){
        return "Roll No.: "+Roll_No+"\tName: "+Name+"\tBranch: "+Branch+"\tYear: "+Year;
    }
}
public class Question4{
    static void addStud() throws Exception{
        FileOutputStream write = new FileOutputStream("C:/Users/Nisarg/Nisarg/Nisarg1/Java/Java_Lab_3/Student.txt",true);
        
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[4];
        
        System.out.print("Roll No.: ");
        arr[0] = sc.nextLine();
        System.out.print("Name: ");
        arr[1] = sc.nextLine();
        System.out.print("Branch: ");
        arr[2] = sc.nextLine();
        System.out.print("Year: ");
        arr[3] = sc.nextLine();
        Student s = new Student(arr[0], arr[1], arr[2], arr[3]);
        String line = s.toString();
        byte b[] = line.getBytes();
        write.write(b);
        write.write(10);
        write.close();
    }
    static void showContent() throws Exception{
        FileInputStream fin = new FileInputStream(new File("C:/Users/Nisarg/Nisarg/Nisarg1/Java/Java_Lab_3/Student.txt"));
        int ch;
        while((ch = fin.read()) != -1){
            System.out.print((char)ch);
        }
        fin.close();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter your choice");
            System.out.println("1. Add a student.");
            System.out.println("2. Entire List of students.");
            System.out.println("3. Exit.");
            int a = sc.nextInt();

            switch(a){
                case 1:
                    addStud();
                    break;
                case 2:
                    showContent();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("\nEnter a valid input.");
            }
        }
    }
}