public class Tenth {
    public static void main(String[] args) {
        HDFC h = new HDFC();
        System.out.println("\nCommon IFSC of HDFC account holders:  "+h.getIFSC());
        Branch1 h1 = new Branch1();
        System.out.println("\nIFSC of HDFC Branch1 account holders: "+h1.getIFSC());
        Branch2 h2 = new Branch2();
        System.out.println("\nIFSC of HDFC Branch2 account holders: "+h2.getIFSC());
        Branch3 h3 = new Branch3();
        System.out.println("\nIFSC of HDFC Branch3 account holders: "+h3.getIFSC()); 
    }
}
class HDFC{
    String IFSC = "HDFCXXXXX";
    String getIFSC(){
        return IFSC;
    }
}
class Branch1 extends HDFC{
    String IFSC = "HDFC1XXXX";
    String getIFSC(){
        return IFSC;
    }
} 
class Branch2 extends HDFC{
    String IFSC = "HDFC2XXXX";
    String getIFSC(){
        return IFSC;
    }
}
class Branch3 extends HDFC{
    String IFSC = "HDFC3XXXX";
    String getIFSC(){
        return IFSC;
    }
}