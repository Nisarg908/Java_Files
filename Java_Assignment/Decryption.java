import java.io.*;

public class Decryption {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int chr;
        try {
            fis = new FileInputStream(new File("encryptedfile.dat"));
            while((chr = fis.read()) != -1){
                System.out.print((char)(chr-5));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fis != null){
                    fis.close();
                }
            } 
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
