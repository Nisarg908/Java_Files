public class Exception_1{
    public static void main(String[] args) {
        String str = null;  
        try{
            System.out.println("Ength of the string is: "+str.length());
        }
        catch(NullPointerException e){
            System.out.println("str = null \nCannot find length of str.");
        }
    }
}