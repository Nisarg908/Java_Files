class A{
    A(){
        System.out.println("Class A\n");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("Class B inheritates Class A");
        System.out.println("B->A\n");
    }
}
class C extends B{
    C(){
        super();
        System.out.println("Class C inheritates Class B and Class B inheritates Class A");
        System.out.println("C->B->A\n");
    }
}
class D extends A{
    D(){
        super();
        System.out.println("Class D also inheritates Class A");
        System.out.println("D->A\n");
    }
}
public class Ninth {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Single Inheritance: \n");
        B b1 = new B();
        System.out.println("Multi-level Inheritance: \n");
        C c = new C();
        System.out.println("Hierarchical Inheritance: \n");
        B b2 = new B();
        D d = new D();
    }
}
