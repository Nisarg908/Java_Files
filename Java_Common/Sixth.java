public class Sixth {
    public static void main(String[] args){
        Varargs("a","abc");
        Varargs("RAM","SHYAM","GHANSHYAM","RAMUKAKA"); 
        Varargs();
    }
    public static void Varargs(String... s1){
        System.out.println("No. of Arguments are: "+s1.length);
        System.out.print("Arguments are: ");
        for(int i = 0; i <= s1.length-1; i++){      // OR for (String str : s1)
            System.out.print(s1[i]+" ");
        } 
        System.out.println("\n");
    }
}