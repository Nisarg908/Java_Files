public class SwapWo3rdVar {
    public static void main(String[] args){
        int a=10 , b=20;
        a=a+b;  //a=30
        b=a-b;  //b=10<-Swapped
        a=a-b;  //a=20<-Swapped
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }    
}
