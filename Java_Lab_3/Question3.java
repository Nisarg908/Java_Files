import java.io.*;

public class Question3 {
    public static void main(String[] args) throws IOException{

        File file = new File("C:/Users/Netafim/Desktop/Java/Txt_files/part1.txt"); 
        FileInputStream fileInputStream = new FileInputStream(file); 
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); 
        BufferedReader br1 = new BufferedReader(inputStreamReader);

        FileInputStream fileInputStream2 = new FileInputStream(file); 
        InputStreamReader inputStreamReader2 = new InputStreamReader(fileInputStream2);
        BufferedReader br2 = new BufferedReader(inputStreamReader2);
        String line; 
        int len = 0;
        while((line=br1.readLine())!=null){
            len++;
            //System.out.println(line);
        }
        String lines[] = new String[len];
        for(int i=0;i<len;i++){
            lines[i] = br2.readLine();
            //System.out.println(lines[i]);
        }
        br1.close();
        br2.close();
        FileOutputStream output = new FileOutputStream("C:/Users/Netafim/Desktop/Java/Txt_files/output.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(output);
        BufferedWriter writer = new BufferedWriter(outputStreamWriter);
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/Netafim/Desktop/Java/Txt_files/output.txt", true)));
        start:    
            for(int j=0; j<len; j++){
              for(int k=j+1; k<len; k++){
                if(lines[j].equals(lines[k])){
                    continue start;
                }
              }
              // byte b[] = lines[j].getBytes();
              writer.write(lines[j]);
              writer.newLine();
            }
        writer.close();
    }
}