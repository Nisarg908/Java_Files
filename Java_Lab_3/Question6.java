import java.io.*;
public class Question6 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("ReaderAndWriter.txt");
        fw.write("We are using FileWriter and FileReader class to write and read respectively from file.\n");
        fw.close();
        FileReader fr = new FileReader("ReaderAndWriter.txt");
        int chr;
        while((chr=fr.read())!=-1)
        {
            System.out.print((char)chr);
        }
        fr.close();
    }
}