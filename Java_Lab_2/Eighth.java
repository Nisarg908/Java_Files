class CallConstructor{
    CallConstructor(){
        this("call");
        System.out.println("Entered the default constructor");
        System.out.println("Exiting the default constructor.\n");
    }
    CallConstructor(String x){
        System.out.println("\nExecuting the called parametrized constructor called by default constructor using this(\"call\") .");
        System.out.println("Exiting the called constructor.\n");
    }
}
public class Eighth {
    public static void main(String[] args) {
        System.out.println("Creating the object and calling the default constructor.");
        CallConstructor c = new CallConstructor();
    }
}
