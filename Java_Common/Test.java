//Nisarg Jignesh Patel
// 21BCP191
// Div-2 G6 

abstract class Measurement {
    private int unit1;
    private int unit2;
    public Measurement() {
        this.unit1 = 1;
        this.unit2 = 1;
    }
    public Measurement(int unit1, int unit2) {
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public Measurement(Measurement m) {
        this(m.getUnit1(), m.getUnit2());
    }
    public int getUnit1() {
        return this.unit1;
    }
    public int getUnit2() {
        return this.unit2;
    }
    public void setUnit1(int unit) {
        this.unit1 = unit;
    }
    public void setUnit2(int unit) {
        this.unit2 = unit;
    }
    abstract public Measurement getDifference(Measurement m1, Measurement m2);

    abstract public Measurement addMeasurement(Measurement m1, Measurement m2);
}

class TimeMeasurement extends Measurement {
    public TimeMeasurement(int hours, int minutes) {
        super(hours, minutes);
    }
    public Measurement getDifference(Measurement m1, Measurement m2) {
        int t1 = (m1.getUnit1() * 60) + m1.getUnit2();
        int t2 = (m2.getUnit1() * 60) + m2.getUnit2();
        int diffInMin = t1 - t2;
        int hours = diffInMin / 60;
        int minutes = diffInMin % 60;
        return new TimeMeasurement(hours, minutes);
    }

    public Measurement addMeasurement(Measurement m1, Measurement m2) {
        int t1 = (m1.getUnit1() * 60) + m1.getUnit2();
        int t2 = (m2.getUnit1() * 60) + m2.getUnit2();

        int addInMin = t1 + t2;
        int hours = (addInMin / 60);
        int minutes = addInMin % 60;
        return new TimeMeasurement(hours, minutes);
    }
    public String toString() {
        return "Time:\tHours: " + getUnit1() + "\tMinutes: " + getUnit2() + "\n";
    }
}

public class Test {
    public static void main(String[] args) {
        TimeMeasurement tm1 = new TimeMeasurement(6, 35);
        System.out.println(tm1);

        TimeMeasurement tm2 = new TimeMeasurement(1, 2);
        System.out.println(tm2);

        System.out.println("Difference in time:");
        System.out.println(tm1.getDifference(tm1, tm2));

        System.out.println("Addition in time:");
        System.out.println(tm1.addMeasurement(tm1, tm2));
    }
}