import java.io.*;


class Residency implements Serializable{
    private int Flat_No;
    private String Name_of_owner;
    private char Block_No;
   // static int count;
    private float price;


    public Residency(int Flat_No, String Name_of_owner, char Block_No, float price){
        this.Flat_No = Flat_No;
        this.Name_of_owner = Name_of_owner;
        this.Block_No = Block_No;
        this.price = price;
    }
    public Residency(){
        this(0, "No Name", ' ', 0f);
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getFlat_No() {
        return Flat_No;
    }
    public void setFlat_No(int flat_No) {
        Flat_No = flat_No;
    }
    public String getName_of_owner() {
        return Name_of_owner;
    }
    public void setName_of_owner(String name_of_owner) {
        Name_of_owner = name_of_owner;
    }
    public char getBlock_No() {
        return Block_No;
    }
    public void setBlock_No(char block_No) {
        Block_No = block_No;
    }


    public String toString(){
        return "Flat No. : " + Flat_No + ", name of owner : " + Name_of_owner + " , Block No. : " + Block_No + " and price : " + price;
    }
}


public class Residency_management {
    public static void main(String[] args) throws Exception{
        Residency r1 = new Residency(101, "Giyan", 'A', 400000f);
        Residency r2 = new Residency(102, "Doremon", 'B',357000f);
        Residency r3 = new Residency(101, "Nobita", 'B',352000f);
        Residency r4 = new Residency(101, "Shizuka", 'C',480000f);
        Residency r5 = new Residency(102, "Suneo", 'A',215000f);


        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ResidencyDetails.dat"));


        ObjectInputStream or = new ObjectInputStream(new FileInputStream("ResidencyDetails.dat"));


        os.writeObject(r1);
        os.writeObject(r2);
        os.writeObject(r3);
        os.writeObject(r4);
        os.writeObject(r5);


        Residency r = (Residency) or.readObject();
        try{
            while(r != null){
                System.out.println(r);
                r = (Residency) or.readObject();
            }
        }catch(Exception e){}


        os.close();
        or.close();
    }
}