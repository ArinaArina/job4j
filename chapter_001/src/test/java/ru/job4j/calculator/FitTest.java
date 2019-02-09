package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 7.02.2019.
 * @version 1.
 */
public class FitTest {
    /**
     * Test manWeight.
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        assertThat(fit.manWeight(180), closeTo(92.0, 0.1));
    }

    /**
     * Test manWeight.
     */
    @Test
    public void manWeight2() {
        Fit fit = new Fit();
        assertThat(fit.manWeight(100), closeTo(-1.0, 0.1));
    }

    /**
     * Test womanWeight.
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        assertThat(fit.womanWeight(170), closeTo(69.0, 0.1));
    }

    /**
     * Test womanWeight.
     */
    @Test
    public void womanWeight2() {
        Fit fit = new Fit();
        assertThat(fit.womanWeight(100), closeTo(-1.0, 0.1));
    }
}
