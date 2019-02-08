package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author Arina Vakurova.
 * @since 8.02.2019.
 * @version 1.
 */
public class PointTest {
    /**
     * Test distanceTo.
     */
    @Test
    public void whenX1Is0X2Is2Y1Is1Y2Is5Then5() {
        Point point = new Point(0, 1);
        Point that = new Point(2, 5);
        double result = point.distanceTo(that);
        assertThat(result, closeTo(4.4, 0.1));
    }
}
