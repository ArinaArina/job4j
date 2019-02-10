package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 10.02.2019.
 * @version 1.
 */
public class FactorialTest {
    /**
     * Test calc.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        assertThat(120, is(factorial.calc(5)));
    }

    /**
     * Test calc.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        assertThat(1, is(factorial.calc(0)));
    }
}
