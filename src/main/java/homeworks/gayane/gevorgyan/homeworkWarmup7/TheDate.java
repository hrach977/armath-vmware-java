package homeworks.gayane.gevorgyan.homeworkWarmup7;

// 1.7  Ex: The Date Class

public class TheDate {

    private int day;
    private int month;
    private int year;
    private int date;


    public TheDate(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
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
    
    public void setDate(int day, int month, int year){

        this.date = date;
    }

    @Override
    public String toString() {
        return  "dd/mm/yyyy   " + day +
                "/" + month +
                "/" + year;
    }
}
