package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 13.02.2019.
 * @version 1.
 */
public class SquareTest {
    /**
     * Test calculate.
     */
    @Test
    public void whenBound3Then149() {
        Square square = new Square();
        int[] expect = new int[] {1, 4, 9};
        assertThat(square.calculate(3), is(expect));
    }

    /**
     * Test calculate.
     */
    @Test
    public void whenBound0Then0() {
        Square square = new Square();
        int[] expect = new int[] {};
        assertThat(square.calculate(0), is(expect));
    }
}