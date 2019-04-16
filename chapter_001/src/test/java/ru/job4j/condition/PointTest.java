package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 8.02.2019.
 * @version 1.
 */
public class PointTest {
    /**
     * Test distance, info.
     */
    @Test
    public void whenX1Is0X2Is2Y1Is1Y2Is5Then5() {
        Point first = new Point(0, 1);
        Point second = new Point(2, 5);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, closeTo(4.0, 0.5));
    }

    /**
     * Test distance.
     */
    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, closeTo(0.0, 0.0));
    }

    /**
     * Test info.
     */
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
}
