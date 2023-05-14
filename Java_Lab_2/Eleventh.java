class Organisms{ 
    void getInfo(){ 
        System.out.println("Food Chain\nOrganisms"); 
    } 
} 

class Plants extends Organisms { 
    void getInfo(){ 
        System.out.println("\nPlants are the producers."); 
    } 
} 

class Herbivores extends Plants { 
    void getInfo(){ 
        System.out.println("\nHerbivored consume Plants"); 
    } 
} 

class Carnivores extends Herbivores{ 
    void getInfo() { 
        System.out.println("\nCarnivores depend on Herbivores"); 
    } 
} 

class Decomposers extends Carnivores{ 
    void getInfo(){ 
        System.out.println("\nDecomposers depend on animals"); 
        System.out.println("\nPlants depend on Decomposers"); 
    } 
} 

public class Eleventh {
    public static void main(String args[]){ 
        Organisms o = new Organisms(); 
        o.getInfo(); 
        Organisms p=new Plants(); 
        p.getInfo(); 
        Organisms h=new Herbivores(); 
        h.getInfo(); 
        Organisms c=new Carnivores(); 
        c.getInfo(); 
        Organisms d=new Decomposers(); 
        d.getInfo(); 
    }
} 