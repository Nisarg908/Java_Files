import java.io.*;

public class Part1_2{
    public static void main(String[] args) throws IOException{
        File file1 = new File("C:\\Users\\Netafim\\Desktop\\Java\\Txt_files\\file1.txt");
        FileReader fr = new FileReader(file1);
        File file2 = new File("C:\\Users\\Netafim\\Desktop\\Java\\Txt_files\\file2.txt");
        FileWriter fw = new FileWriter(file2);
        int upperch , ch;
        
        while((ch = fr.read()) != -1){
            upperch = Character.toUpperCase(ch);
            fw.write(upperch);
        }
        fr.close();
        fw.close();
    }
}