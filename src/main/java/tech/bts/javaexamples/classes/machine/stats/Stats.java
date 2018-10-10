package tech.bts.javaexamples.classes.machine.stats;

public class Stats {

    private double sum = 0;
    private double count = 0;
    private double max = 0;
    private double min = 0;

    public void add(double x) {

        sum += x;
        count++;

        if (count == 1) {
            max = x;
            min = x;
        } else {
            max = x > max ? x : max;
            min = x < min ? x : min;
        }
    }

    public double getSum() {
        return sum;
    }

    public double getCount() {
        return count;
    }

    public double getAverage() {
        return sum / count;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}
