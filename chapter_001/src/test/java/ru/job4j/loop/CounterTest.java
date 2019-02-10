package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 10.02.2019.
 * @version 1.
 */
public class CounterTest {
    /**
     * Test add.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        assertThat(30, is(counter.add(1, 10)));
    }
}
