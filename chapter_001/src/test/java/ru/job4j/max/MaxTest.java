package ru.job4j.max;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 9.02.2019.
 * @version 1.
 */
public class MaxTest {
    /**
     * Test max.
     * Если первое меньше второго.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(3, 5);
        assertThat(result, is(5));
    }

    /**
     * Test max.
     * Если первое больше второго.
     */
    @Test
    public void whenFirstLargerSecond() {
        Max maximum = new Max();
        int result = maximum.max(3, 5);
        assertThat(result, is(5));
    }

    /**
     * Test max.
     * Если оба равны.
     */
    @Test
    public void whenFirstEqualsSecond() {
        Max maximum = new Max();
        int result = maximum.max(3, 3);
        assertThat(result, is(3));
    }
}
