import java.io.*;

public class Encrypt {
    public static void main(String[] args) {
        File fileread = null;
        if(0 < args.length){
            fileread = new File(args[0]);
        }
        else{
            System.exit(0);
        }
        FileInputStream fi = null;
        FileOutputStream fo = null;
        int w, r;
        try {
            fi = new FileInputStream(fileread);
            fo = new FileOutputStream(new File("encryptedfile.dat"));
            while((r = fi.read()) != -1){
                w = r + 5;
                fo.write(w);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fi != null){
                    fi.close();
                    fo.close();
                }
            } 
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
