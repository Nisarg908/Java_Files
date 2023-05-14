class Bill{
    private int billNumber;
    public float units_of_consumption;
    protected float unitRate = 10;
    static int count = 0;
    Bill(){
        billNumber = 0;
        units_of_consumption = 0;
        count++;
    }
    Bill(String billNumber){

    }
}