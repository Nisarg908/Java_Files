import java.io.*;

public class Decrypt {
    public static void main(String[] args) {
        FileInputStream fi = null;
        int r;
        try {
            fi = new FileInputStream(new File("encryptedfile.dat"));
            while((r = fi.read()) != -1){
                System.out.print((char)(r-5));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fi != null){
                    fi.close();
                }
            } 
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}