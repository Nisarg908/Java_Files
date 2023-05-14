public class Fifth{
	public static void main(String[] args)
	{
		String x = "Hello World";
        System.out.println("Before changing string:  "+x+"\n");
		change(x);
        System.out.println("After changing string:  "+x);
	}
	public static void change(String x)
	{
		x = "Original";
        System.out.println("Using change function to change string x=\"Hello World\":  "+x+"\n");

	}
}
