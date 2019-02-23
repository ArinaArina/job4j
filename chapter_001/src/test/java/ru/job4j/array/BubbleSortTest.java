package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 23.02.2019.
 * @version 1.
 */
public class BubbleSortTest {
    /**
     * Test sort.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        int[] result = bubble.sort(input);
        assertThat(result, is(expect));
    }

    /**
     * Test sort.
     */
    @Test
    public void whenSortArrayEmptyThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {};
        int[] expect = new int[] {};
        int[] result = bubble.sort(input);
        assertThat(result, is(expect));
    }
}
