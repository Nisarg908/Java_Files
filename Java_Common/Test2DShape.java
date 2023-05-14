//Nisarg Jignesh Patel
//21BCP191
//Div-2 G6
//Assignment-2

abstract class TwoDShape {
    private float length;
    private float width;

    public TwoDShape() {
        length = 1;
        width = 1;
    }
    public TwoDShape(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public TwoDShape(TwoDShape s) {
        this(s.getlength(), s.getwidth());
    }
    public float getlength() {
        return this.length;
    }

    public float getwidth() {
        return this.width;
    }
    public void setlength(float length) {
        this.length = length;
    }
    public void setwidth(float width) {
        this.width = width;
    }
    abstract public float getArea();
}

class Triangle extends TwoDShape {
    Triangle(float height, float base) {
        super(base, height);
    }
    public float getArea() {
        return  (0.5f*getlength()*getwidth());
    };
    public int equals(Triangle t1, Triangle t2) {
        if (t1.getlength() == t2.getlength() && t1.getwidth() == t2.getwidth()) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "\nTriangle:\tHeight: " + getwidth() + "\tBase: " + getlength() + "\nArea of the triangle is: "+getArea();
    }
}

class Rectangle extends TwoDShape {
    Rectangle(float length, float width) {
        super(length, width);
    }
    public float getArea() {
        return  (getlength()*getwidth());
    };
    public int equals(Rectangle r1, Rectangle r2) {
        if ((r1.getlength() == r2.getlength() && r1.getwidth() == r2.getwidth()) || (r1.getlength() == r2.getwidth() && r1.getwidth() == r2.getlength())) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "\nRectangle:\tHeight: " + getwidth() + "\tBase: " + getlength() +"\nArea of the rectangle is: "+getArea();
    }
}

class Square extends TwoDShape {
    Square(float length) {
        super(length, length);
    }
    public float getArea() {
        return  (getlength()*getlength());
    };
    public int equals(Square r1, Square r2) {
        if (r1.getlength() == r2.getlength()) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "\nSquare:\tSide: "+getlength() + "\nArea of the square is: "+getArea();
    }
}

public class Test2DShape{
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4,5);
        System.out.println(t1);
        Triangle t2 = new Triangle(6,3);
        System.out.println(t2);
        int e = t1.equals(t1,t2);
        if(e==1){
            System.out.println("Triangles are equal");
        }
        else{
            System.out.println("Triangles are not equal");
        }
        Rectangle r1 = new Rectangle(3,9);
        System.out.println(r1);
        Rectangle r2 = new Rectangle(9,3);
        System.out.println(r2);
        e = r1.equals(r1,r2);
        if(e==1){
            System.out.println("Rectangles are equal");
        }
        else{
            System.out.println("Rectangles are not equal.");
        }
        Square sq1 = new Square(2);
        System.out.println(sq1);
        Square sq2 = new Square(3);
        System.out.println(sq2);
        e = sq2.equals(sq1,sq2);
        if(e==1){
            System.out.println("Rectangles are equal");
        }
        else{
            System.out.println("Squares are not equal");
        }
    }
}