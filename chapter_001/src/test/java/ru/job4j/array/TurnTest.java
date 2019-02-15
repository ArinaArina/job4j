package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 15.02.2019.
 * @version 1.
 */
public class TurnTest {
    /**
     * Test back.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    /**
     * Test back.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    /**
     * Test back.
     */
    @Test
    public void whenTurnArrayWith0AmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {};
        int[] result = turner.back(input);
        int[] expect = new int[] {};
        assertThat(result, is(expect));
    }
}
