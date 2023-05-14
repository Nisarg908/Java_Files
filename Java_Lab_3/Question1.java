import java.io.*; 

public class Question1 {
    public static void main(String[] args) throws IOException{ 
        File file = new File("C:/Users/Netafim/Desktop/Java/Txt_files/part1.txt"); 
        FileInputStream fileInputStream = new FileInputStream(file);    //Reads file in byte form
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); //a bridge from byte streams to character streams
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); //read the stream of characters from the specified source (character-input stream).
        String line; 
        int countSentence = 0;
        int countWord = 0;
        int countChar = 0;
        int countParagraph = 0;
        int counter =0;
        while ((line = bufferedReader.readLine()) != null) {
            counter++;
            String sentence[] = line.strip().split("[.!?] ");
            countSentence+=sentence.length;
            String words[] = line.strip().split(" ");
            countWord += words.length;
            countChar += line.length();
            if(line == ""){
                countParagraph++;
            }
        }
        if(counter!=0){
            countParagraph++;
        }
        System.out.println("No. of sentences in the file are: "+countSentence);
        System.out.println("No. of words in file are: "+countWord);
        System.out.println("No. of characters in file are: "+countChar);
        System.out.println(countParagraph);
    }
}