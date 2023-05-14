import java.io.*;
import java.util.*;

class Residency implements Serializable{
    private int Flat_No;
	private String Name_of_owner;
	private char Block_No;
    private float price;

    public Residency(int Flat_No, String Name_of_owner, char Block_No, float price){
		this.Flat_No = Flat_No;
        this.Name_of_owner = Name_of_owner;
        this.Block_No = Block_No;
        this.price = price;
	}
    public Residency(){
	
		this(0, "No Name", ' ', 0);
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
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public String toString(){
		return "Flat No. : " + Flat_No + ", name of owner : " + Name_of_owner + " , Block No. : " + Block_No + " , Price : " + price;
	}
}

public class ResidencyManage {
    public static void main(String[] args) throws Exception{

		ObjectInputStream or = new ObjectInputStream(new FileInputStream("ResidencyDetails.dat"));

        TreeSet <Float> set=new TreeSet <Float>();
        Residency r = (Residency) or.readObject();
        try{
			while(r != null){
                set.add(r.getPrice());
                r = (Residency) or.readObject();
            }
		}catch(Exception e){}

        System.out.println("Prices of the Flats:");
        for (Float value : set){
            // Printing the values inside the object
            System.out.print(value + ", ");
        }
        System.out.println();
        or.close();
            //CREATING ANOTHER SET
        TreeSet <Float> set1 = new TreeSet<Float>();
        set1 = (TreeSet <Float>) set.subSet(300000f,400000f);

        
        //Opening fie in read mode again.
        or = new ObjectInputStream(new FileInputStream("ResidencyDetails.dat"));

        r = (Residency) or.readObject();
        Residency arr[] = new Residency [set1.size()]; 
        int i = 0;
        try{
			while(r != null){
                if(set.first()==r.getPrice()){
                    System.out.println("\nFlat with Lowest Price:");
                    System.out.println(r);
                }
                if(set.last()==r.getPrice()){
                    System.out.println("\nFlat with Highest Price:");
                    System.out.println(r);
                }
                for(float j : set1){
                    if (j == r.getPrice()){
                        arr[i] = r;
                        i++;
                    }
                }
                r = (Residency) or.readObject();
            }
		}catch(Exception e){}
            System.out.println("\nFlats with Price b/w 300000 to 400000:");
            for(int k=0; k<i; k++){
                System.out.println(arr[k]);
                System.out.println();
            }
        or.close();
    }        
}

