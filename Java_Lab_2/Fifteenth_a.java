//Overriding Function printMessage() Inside same Package1 using Classes Fifteenth_1 and Fifteenth_3
//Overriding Function public void printMessage() In different Packages using Classes Fifteenth_1 and Fifteenth_2

import Package1.Fifteenth_1;
import Package1.Fifteenth_3;
import Package2.Fifteenth_2;

public class Fifteenth_a{
    public static void main(String[] args) {
        Fifteenth_1 f1 = new Fifteenth_1();
        Fifteenth_2 f2 = new Fifteenth_2();
        Fifteenth_3 f3 = new Fifteenth_3();
        System.out.println("\nCalling the method printMethod() of Fifteenth_1 class inside Package1.");
        f1.printMessage();
        System.out.println("\nOverriding method printMethod() using Object of Fifteenth_2 class which is in different package.");
        f2.printMessage();
        System.out.println("\nOverriding method printMethod() using object of Fifteenth_3 class which is in same package.");
        f3.PrintMessage();
    }
}
