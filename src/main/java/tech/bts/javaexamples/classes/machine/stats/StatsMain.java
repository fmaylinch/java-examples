package tech.bts.javaexamples.classes.machine.stats;

public class StatsMain {

    public static void main(String[] args) {

        Stats stats = new Stats();

        stats.add(7.0);
        stats.add(8.0);
        stats.add(4.0);
        stats.add(5.0);

        System.out.println( stats.getSum() );
        System.out.println( stats.getCount() );
        System.out.println( stats.getAverage() );
        System.out.println( stats.getMax() );
        System.out.println( stats.getMin() );
    }
}
