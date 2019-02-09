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
     * Test max с двумя параметрами.
     * Если первое меньше второго.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        assertThat(maximum.max(3, 5), is(5));
    }

    /**
     * Test max с двумя параметрами.
     * Если первое больше второго.
     */
    @Test
    public void whenFirstLargerSecond() {
        Max maximum = new Max();
        assertThat(maximum.max(5, 3), is(5));
    }

    /**
     * Test max с тремя параметрами.
     * Если первое больше второго и третьего.
     */
    @Test
    public void whenFirstLargerSecondAndThird() {
        Max maximum = new Max();
        assertThat(maximum.max(3, 2, 1), is(3));
    }

    /**
     * Test max с тремя параметрами.
     * Если второе больше первого и третьего.
     */
    @Test
    public void whenSecondLargerFirstAndThird() {
        Max maximum = new Max();
        assertThat(maximum.max(1, 3, 2), is(3));
    }

    /**
     * Test max с тремя параметрами.
     * Если третье больше первого и второго.
     */
    @Test
    public void whenThirdLargerFirstAndSecond() {
        Max maximum = new Max();
        assertThat(maximum.max(1, 2, 3), is(3));
    }
}
