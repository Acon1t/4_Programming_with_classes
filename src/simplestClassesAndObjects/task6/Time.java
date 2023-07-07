package src.simplestClassesAndObjects.task6;

public class Time {
    public static void main(String[] args) {

        Time time = new Time(24, 0, 0);
        System.out.println(time);
        time.setHour(11);
        time.setMinute(22);
        time.setSecond(9);
        System.out.println(time);
    }

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {

        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second > 59 || second < 0) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
