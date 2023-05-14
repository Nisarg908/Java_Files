import java.io.*;

public class Question2
{
    public static void main(String[] args) throws IOException 
    {
        FileReader a =new FileReader("C:/Users/Netafim/Desktop/Java/Txt_files/file1.txt");//Reads in character form
        int ch;
        int upperchar;
        FileWriter fw=new FileWriter("C:/Users/Netafim/Desktop/Java/Txt_files/file1_op.txt");
        while((ch=a.read())!=-1)
        {
            // System.out.print((char) ch);
            if(ch>=((int)'a') && ch<=((int)'z') )
            {
                //System.out.print((char) ch);
                upperchar=Character.toUpperCase(ch);
                fw.write(upperchar);
            }
            else
            {
                fw.write(ch);
            }
        }
        a.close();
        fw.close();
    }    
}
