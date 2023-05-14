class Employee {
    String name;
    int age;
    Employee(String name , int age){
        this.name = name;
        this.age = age;
    }
}
class Teacher extends Employee{
    String subject;
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject = subject;
    }
}
public class Third {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Employee e = new Employee("XYZ",24);
        Teacher t = new Teacher("ABC",29,"00PC");
        System.out.println("Name of Employee: "+e.name);
        System.out.println("Age of Employee: "+e.age);
        System.out.println();
        System.out.println("Name of Teacher: "+t.name);
        System.out.println("Age of Teacher: "+t.age);
        System.out.println("Subject of Teacher: "+t.subject);
    }   
}