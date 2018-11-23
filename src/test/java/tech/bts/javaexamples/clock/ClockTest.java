package tech.bts.javaexamples.clock;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ClockTest {

    @Test
    public void test_get_time() {

        Clock c = new Clock(13, 20, 15);
        assertThat(c.getTime(), is("13:20:15"));
    }

    @Test
    public void test_few_seconds() {

        Clock c = new Clock(13, 20, 7);
        assertThat(c.getTime(), is("13:20:07"));
    }

    @Test
    public void test_few_minutes() {

        Clock c = new Clock(16, 8, 20);
        assertThat(c.getTime(), is("16:08:20"));
    }

    @Test
    public void test_few_hours() {

        Clock c = new Clock(3, 18, 20);
        assertThat(c.getTime(), is("03:18:20"));
    }


    @Test
    public void test_small_values() {

        Clock c = new Clock(3, 5, 6);
        assertThat(c.getTime(), is("03:05:06"));
    }

    @Test
    public void test_zeros() {

        Clock c = new Clock(0, 0, 0);
        assertThat(c.getTime(), is("00:00:00"));
    }

    @Test
    public void add_seconds() {

        Clock c = new Clock(13, 20, 15);
        c.addSeconds(12);
        assertThat(c.getTime(), is("13:20:27"));
    }

    @Test
    public void add_seconds_to_next_minute() {

        Clock c = new Clock(13, 20, 50);
        c.addSeconds(20);
        assertThat(c.getTime(), is("13:21:10"));
    }

    @Test
    public void add_seconds_until_adds_more_minutes() {

        Clock c = new Clock(13, 20, 50);
        c.addSeconds(90);
        assertThat(c.getTime(), is("13:22:20"));
    }

    @Test
    public void add_seconds_until_adds_more_hours() {

        Clock c = new Clock(1, 3, 5);
        c.addSeconds((60 * 60 * 3) + (60 * 5) + 30);
        assertThat(c.getTime(), is("04:08:35"));
    }


    @Test
    public void modify_two_clocks() {

        Clock c1 = new Clock(0, 0, 0);
        Clock c2 = new Clock(0, 0, 0);

        //c1.addSeconds(2);
        //c2.addSeconds(2);
        addSecs(c1, c2, 2);

        assertThat(c1.getTime(), is("00:00:02"));
        assertThat(c2.getTime(), is("00:00:02"));
    }

    void addSecs(Clock clock1, Clock clock2, int s) {
        clock1.addSeconds(s);
        clock2.addSeconds(s);
    }
}