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
public class Question5{
    static void addStud() throws Exception{
        FileOutputStream write = new FileOutputStream("C:/Users/Netafim/Desktop/Java/Txt_files/Students.txt",true);
        OutputStreamWriter output = new OutputStreamWriter(write);
        BufferedWriter writer = new BufferedWriter(output);
        
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
        writer.write(line);
        writer.newLine();
        writer.close();
    }
    static void searchStud(String Roll_no) throws Exception{
        File file = new File("C:/Users/Netafim/Desktop/Java/Txt_files/Students.txt"); 
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line;
        int counter = 0;
        while ((line = reader.readLine()) != null){
            String words[] = line.strip().split("\t");
            //System.out.println(Arrays.toString(words));
            if(("Roll No.: "+Roll_no).equals(words[0])){
                System.out.println(line);
                counter++;
            }
        }
        if(counter == 0){
            System.out.println("Roll No. of student not found.\n");
        }
        reader.close();
    }
    static void showContent() throws Exception{
        File file = new File("C:/Users/Netafim/Desktop/Java/Txt_files/Students.txt"); 
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter your choice");
            System.out.println("1. Add a student.");
            System.out.println("2. Search for a student.");
            System.out.println("3. Entire List of students.");
            System.out.println("4. Exit.");
            int a = sc.nextInt();
            String Roll_no;
            switch(a){
                case 1:
                    addStud();
                    break;
                case 2:
                    System.out.print("Enter Roll No.: ");
                    Roll_no = sc.next();
                    searchStud(Roll_no);
                    break;
                case 3:
                    showContent();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("\nEnter a valid input.");
            }
        }
    }
}