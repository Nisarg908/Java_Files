import java.io.*;

public class Encryption {
    public static void main(String[] args) {
        File file_read = null;
        if(0 < args.length){
            file_read = new File(args[0]);
        }
        else{
            System.out.println(args.length+" No Argument passed");
            System.out.println("Need to give the name of file with it's extension in Command Line Argument Run again.");
            System.exit(0);
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int chw, chr;
        try {
            fis = new FileInputStream(file_read);
            fos = new FileOutputStream(new File("encryptedfile.dat"));
            while((chr = fis.read()) != -1){
                chw = chr + 5;
                fos.write(chw);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fis != null){
                    fis.close();
                    fos.close();
                }
            } 
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
