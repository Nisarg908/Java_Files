/*Binary Stream - ObjectInputStream-ObjectOutputStream Example - Creating a Product class.storing Product 
objects to the file "ProductDetails.txt". Open "ProductDetails.txt" for reading.read Objects of Products from
file and print it to the console.*/

import java.io.*;

class Product implements Serializable{
	
	private int pId;
	private String prName;
	private int pRate;

	static int count;

	/*
	static{
		System.out.println("Class Initializer Block");
	}
	
	//Initializer block
	{
		pId = 101 + count++;
		System.out.println("Initializer Block");
	}
	*/

	//Constructor
	public Product(String pName, int rate){
		
		pId = 101 + count++;
		this.prName = pName;
		pRate = rate;
	}
		
	public Product(String name){
		pId = 101 + count++;
		this.prName = name;
		pRate = 100;
	}
	
	//Default constructor
	public Product(){
	
		this("NoName", 0);
	}
	
	//copy constructor
	public Product(Product p){
		prName = p.prName;
		pRate = p.pRate;	
	}

	public String getName(){
		return prName;
	}
	
	public void setId(int id){
		pId = id; 
	}

	public void setRate(int rate){pRate = rate;}
	
	public void setName(String name) {prName = name;} 

	public int getId(){return pId;}

	public int getRate(){return pRate;}
	
	public String toString(){
		return " Product id : " + pId + ", name : " + prName + " and rate : " + pRate;
	}

	public boolean equals(Object other){
		System.out.println("Equals method!");
		if(other instanceof Product){
			Product p = (Product) other;
			return (this.prName == p.prName) && (this.pRate == p.pRate);
		}
		return false;
	}
	
	
	/*static method
	public static int getTotalCount(){return count;}
	*/
}

class ObjectInputOutputStream{
	
	public static void main(String[] args) throws Exception{

		Product p1 = new Product("p1", 200);
		Product p2 = new Product("p2", 100);
		Product p3 = new Product("p3", 50);
	
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ProductDetails.txt"));

		ObjectInputStream or = new ObjectInputStream(new FileInputStream("ProductDetails.txt"));
		
		os.writeObject(p1);
		os.writeObject(p2);
		os.writeObject(p3);
		
		
		Product p =(Product) or.readObject();
		try{
			while(p != null){
				System.out.println(p);
				p = (Product) or.readObject();
			}
		}catch(Exception e){}

		os.close();
		or.close();
	}
}