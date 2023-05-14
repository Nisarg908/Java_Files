class  Animal{
	String colour;
	int age;
	void initObj(String c,int a)
	{
		colour = c;
	 	age = a;
	}
	void display(){
		System.out.println(colour+" "+age);
	}
	public static void main(String[] args){
		Animal buzo = new Animal();
		buzo.initObj("Black",20);
		buzo.display();
	}
}
