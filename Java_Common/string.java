import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class string {
    public static void main(String[] args) {
        //String name = new String("Nisarg");
        String name = "Nisarg";
        System.out.print("The name is: ");
        System.out.println(name);
        System.out.println("The name is: ");
        System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f\n",a,b);
        System.out.format("The value of a is %d and value of b is %f\n",a,b);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput the String: ");
        String st = sc.nextLine();
        System.out.println(st);
        System.out.println("Functions on string name = \"Nisarg\"");
        System.out.println("Length of the string = "+name.length());
        System.out.println("Lower cased string = "+name.toLowerCase());
        System.out.println("Upper cased string = "+name.toUpperCase());
        System.out.println("Check if 1st letter is capital of ntered string: "+Character.isUpperCase(name.charAt(0)));
        String nonTrimmedString = "      Nisarg Patel     ";
        System.out.println("New modified string: ");
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString;
        System.out.println("trimmed nontrimmedstring: ");
        System.out.println(trimmedString);
        System.out.println("Functions on string name = \"Nisarg\"");
        System.out.println("Subtstring from index 3: "+name.substring(3));
        System.out.println("Subtstring from index 1 to 5: "+name.substring(1,5));
        System.out.println("Replace r in Nisarg to l: "+name.replace('r','l'));
        System.out.println("Replace arg in Nisarg to a: "+name.replace("arg","a"));
        System.out.println("Return true if starts with \"Nis\""+name.startsWith("Nis"));
        System.out.println("Return true if ends with \"rg\""+name.endsWith("rg"));
        System.out.println("Returns the character at index 2"+name.charAt(2));
        System.out.println("Returns the index of substring\"arg\""+name.indexOf("arg"));
        String ModifiedName =" Nisargrgrg";
        System.out.println("New ModifiedName is: "+ModifiedName);
        System.out.println("Returns the index of substring\"rg\": "+ModifiedName.indexOf("rg"));
        System.out.println("Returns the index of substring\"rg\" from index 7: "+ModifiedName.indexOf("rg",7));
        System.out.println("Returs last index if \"rg\": "+ModifiedName.lastIndexOf("rg"));
        System.out.println("Returs last index if \"12\": "+ModifiedName.lastIndexOf("12"));
        System.out.println("Returs last index if \"rg\" from index 5: "+ModifiedName.lastIndexOf("rg",5));
        System.out.println("Checking if string name is equal to \"Nisarg\": "+name.equals("Nisarg"));
        System.out.println("Checking if string name is equal to \"Nisarg\" Ignoring the Case: "+name.equalsIgnoreCase("nisaRg"));
        System.out.println("\\");
    }
}
