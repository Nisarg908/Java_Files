public class Seventh_4 {
    int a,b;
    Seventh_4(int a,int b){
        this.a = a;
        this.b = b;
    }
    //returnObj returns an object of Seventh_4
    Seventh_4 returnObj(){
        Seventh_4 temp = new Seventh_4(a+10,b+10);
        System.out.println("Returning object temp.\n");
        return temp;
    }
    public static void main(String[] args) {
        Seventh_4 obj = new Seventh_4(0, 0);
        Seventh_4 r = obj.returnObj();
        System.out.println("Assigning object reference variable temp returned to object reference variable r.\nSo now r refers to the same object as temp.");
        System.out.println("Content of object r are:");
        System.out.println((r.a));
        System.out.println((r.b));
    }
}
