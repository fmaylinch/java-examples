package tech.bts.javaexamples.clock;

public class Clock {

    private int seconds;
    private int minutes;
    private int hours;

    public Clock(int h, int m, int s) {
        this.seconds = s;
        this.minutes = m;
        this.hours = h;
    }

    public String getTime() {

        return prefixZero(this.hours)
                + ":" + prefixZero(this.minutes)
                + ":" + prefixZero(this.seconds);
    }

    public void addSeconds(int s) {

        this.seconds += s;

        this.minutes += this.seconds / 60;
        this.seconds %= 60;

        this.hours += this.minutes / 60;
        this.minutes %= 60;
    }

    private static String prefixZero(int number) {

        // static methods don't have "this"
        return ( number < 10 ? "0" : "" ) + number;
    }
}
