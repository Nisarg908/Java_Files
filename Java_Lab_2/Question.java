class A{
    String x="a"; 
    A(){
        String x = "A";
    }
}
class B extends A{
    String y;
    B(){
        super();
        String y = "B";
    }
}
public class Question {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(b.y);
    }
}
