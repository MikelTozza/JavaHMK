public class Ddate {
    private int day;
    private int month;
    private int year;

    public Ddate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public boolean dateDepasse(Ddate currentDay){
        return true;
    }

    @Override
    public String toString() {
        return (day +"/"+month+"/"+year);
    }
}
