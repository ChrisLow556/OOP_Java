package lab3.Question1;

public class MyDate {
    private int year;
    private int month;
    private int day;

    //Constructs a MyDate with specified year, month, day
    MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString(){
        String dateToString = year + "/" + month + "/" + day;
        return dateToString;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
