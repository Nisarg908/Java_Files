//Multiple Inheritance
public class Fourteenth{
    public static void main(String[] args) {
        Child c = new Child();
        c.traitsInherited();
    }
}
interface Mother{
    default void eyes(){
        System.out.println("\nChild's Iris are brown like Mothers eyes.");
    }
}
interface Father{
    default void hairs(){
        System.out.println("\nChild's hairs are black like Fathers hairs.\n");
    }
}
class Child implements Mother,Father{
    void traitsInherited(){
        Mother.super.eyes();
        Father.super.hairs();
    }
}
