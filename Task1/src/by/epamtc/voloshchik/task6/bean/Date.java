package by.epamtc.voloshchik.task6.bean;

public class Date {

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Date(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)return true;
        if(getClass() != obj.getClass())return false;
        Date d = (Date)obj;
        return hour == d.getHour() && minute == d.getMinute() && second == d.getSecond();
    }

    public String toString() {
        return "Hour:"+hour+
                " Minute:"+minute+
                " Second:"+second;
    }
}
