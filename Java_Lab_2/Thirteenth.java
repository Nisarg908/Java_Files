import java.util.Scanner;

public class Thirteenth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout choice for finding the are of: \n1.Triangle\n2.Rectangle\n3.Circle\n4.Exit");
        System.out.print("Choice: ");
        int ch = sc.nextInt(); 
        System.out.println();
        if(ch == 1){
            System.out.println("Enter the height and base of the Triangle.");
            System.out.print("Base: ");
            float base = sc.nextFloat();
            System.out.print("Height: ");
            float height = sc.nextFloat();
            Triangle t = new Triangle(base,height);
            System.out.println("Area of the given triangle is: "+t.area());
        }
        else if(ch == 2){
            System.out.println("Enter the length and width of the Triangle.");
            System.out.print("Length: ");
            float length = sc.nextFloat();
            System.out.print("Width: ");
            float width = sc.nextFloat();
            Rectangle r = new Rectangle(length,width);
            System.out.println("Area of the given rectangle is: "+r.area());
        }
        else if(ch == 3){
            System.out.println("Enter the radius of the circle.");
            System.out.println("Radius: ");
            float radius = sc.nextFloat();
            Circle c = new Circle(radius);
            System.out.println("Area of the given circle is: "+c.area());
        }
        else{
            return;
        }
    }
}

abstract class Shape{
    float a,b;
    Shape(float a,float b){
        this.a = a;
        this.b = b;
    }
    abstract float area();
}
class Triangle extends Shape{
    Triangle(float a,float b){
        super(a,b);
    }
    float area(){
        return (0.5f*super.a*super.b);
    }
}
class Rectangle extends Shape{
    Rectangle(float a,float b){
        super(a,b);
    }
    float area(){
        return (super.a*super.b);
    }
}
class Circle extends Shape{
    Circle(float a){
        super(a,a);
    }
    float area(){
        return (3.14f*super.a*super.a);
    }
}