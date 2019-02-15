package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 15.02.2019.
 * @version 1.
 */
public class FindLoopTest {
    /**
     * Test indexOf.
     */
    @Test
    public void whenArrayHasLength5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 2, 1};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Test indexOf.
     */
    @Test
    public void whenArrayHasLength5Then() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 2, 1};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    /**
     * Test indexOf.
     */
    @Test
    public void whenArrayHasLength0Then() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
