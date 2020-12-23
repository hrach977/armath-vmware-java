package homeworks.gayane.gevorgyan.homework7;

// 1.8  Ex: The Time Class

public class TheTime {
    private int hour;
    private int minute;
    private int second;

    public TheTime(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hh, int mm, int ss) {
        this.setTime(21, 51, 35);
    }

    @Override
    public String toString() {
        return "hh:mm:ss" +
                "  " + hour +
                ":" + minute +
                ":" + second;
    }

    public TheTime nextSecond() {

            second++;
            return new TheTime(22, 30, second++);
        }

        public TheTime previousSecond(){
            second--;
            return new TheTime(22, 30, second--);
        }
    }

