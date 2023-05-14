//Nisarg Jignesh Patel
//21BCP191
//DIV-3 G6

import java.util.Scanner;

class Bill{
    protected int billNumber;
    protected float units_of_consumption;
    private float unitRate = 1;
    static int count=0;
    public Bill(){
            count = count + 1;
    }
    Bill(int billNumber){
        this.billNumber = billNumber;
    }
    Bill(int billNumber,float units_of_consumption,float unitRate){
        this.billNumber = billNumber;
        this.units_of_consumption = units_of_consumption;
        this.unitRate = unitRate;
    }
    Bill(Bill b){
        System.out.println("Your bill contains the following info.\n1.Bill Number\n2.Units of Consumption\n3.unit Rate= "+b.unitRate);
    }
    public void setBillNumber(int billNumber){
        this.billNumber = billNumber;
    }
    public float getBillAmount(){
        return this.units_of_consumption*this.unitRate;
    }
    public static int getTotalCount() {
        return count;
    }
    public float getunitRate() {
        return unitRate;
    }
    public void setunitRate(float unitRate){
        this.unitRate = unitRate;
    }
    public static int equals(Bill b1, Bill b2) {
        if(b1.billNumber == b2.billNumber){
            return 1;
        }
        return 0;
    }
    public String toString(){
        System.out.println("Bill number: "+billNumber);
        System.out.println("Units of Consumption: "+units_of_consumption);
        System.out.println("Unit Rate: "+unitRate);
        return "\n\n";
    }

}

class ElectricityBill extends Bill{
    public float lastbill;
    public float fixed_charge;
    ElectricityBill(int billNumber) {
        super(billNumber);
    }
    ElectricityBill(int billNumber,float units_of_consumption,float unitRate,float fixed_charge) {
        super(billNumber,units_of_consumption,unitRate);
        this.fixed_charge = fixed_charge;
    }
    ElectricityBill(int billNumber,float lastbill){
        this.lastbill = lastbill;
    }
    public float getBillAmount() {
        return super.getBillAmount() + fixed_charge;
    }
    public String toString() {
        return "Electricity Bill:\nBill No.: " + super.billNumber +"\nUnits of Consumption: " + super.units_of_consumption +"\nUnit Rate: " + super.getunitRate() +"\nFixed Charge: " + fixed_charge;
    }
}
public class BillTest {
    public static float getAverageBillAmount(float a, float b, float c) {
        float avg = 0;
        avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Bill bill1 = new Bill(2111);
        bill1.units_of_consumption = 101;
        bill1.setunitRate(1);
        System.out.println(bill1);
        System.out.println("Bill amount: " + bill1.getBillAmount());
        Bill bill2 = new Bill(1001);
        bill2.units_of_consumption = 100;
        bill1.setunitRate(4);
        System.out.println(bill2);
        System.out.println("Bill amount: " + bill2.getBillAmount());
        Bill b3 = new Bill(1002);
        b3.units_of_consumption = 150;
        System.out.println("Details for b3 " + b3);
        System.out.println("Bill amount: " + b3.getBillAmount());
        System.out.println("all bills are");
        System.out.println(bill1.toString());
        System.out.println(bill2.toString());
        System.out.println(b3.toString());
        System.out.println("all bills average is");
        System.out.println(getAverageBillAmount(bill1.getBillAmount(), bill2.getBillAmount(), b3.getBillAmount()));
    }
}
