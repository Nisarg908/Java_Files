class Reference {
    String s1; 
    private String PvtStr = "Its private."; 
    public String PubStr = "Its public."; 
    final String FinalStr = "It is final.";

    Reference(String str) {
        s1 = str; 
    }
    void passByReference(Reference r){
        r.s1 = "Original";
    }
}
public class Fifth {
    public static void change(String x)
	{
		x = "Original";
        System.out.println("Using change function to change string x=\"Hello World\":  "+x);

	}
    public static void main(String[] args)
	{
		String x = "Hello World";
        System.out.println("Pass by value\n");
        System.out.println("Before changing string:  "+x);
		change(x);
        System.out.println("After changing string:  "+x);

        
        Reference r1 = new Reference("Hello world");
        System.out.println("\nPass by reference\n");
        System.out.println("Before changing string of object r1:  "+(r1.s1));
        r1.passByReference(r1);
        System.out.println("After changing string of object r1:  "+(r1.s1));
        
        
        //System.out.println(r1.PvtStr);
        System.out.println("\nTrying to access variables with private,public and final access specifiers\n");
        System.out.println(r1.PubStr);
        System.out.println(r1.FinalStr);
        //r1.FinalStr = "Final can not change";
        r1.PubStr = "Public can be changed";
        System.out.println("New PubStr: "+r1.PubStr);
	}
}