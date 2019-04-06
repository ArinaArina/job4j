package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 6.04.2019.
 * @version 1.
 */
public class ArrayDuplicateTest {
    /**
     * Test remove.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = {"Привет", "ПВА", "Мир", "Привет", "Привет", "Мир", "ПВА"};
        String[] expected = {"Привет", "ПВА", "Мир"};
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, is(expected));
    }

    /**
     * Test remove.
     */
    @Test
    public void whenWithoutDuplicatesThenArrayWithoutChangeDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Супер"};
        String[] expected = {"Привет", "Мир", "Супер"};
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, is(expected));
    }

    /**
     * Test remove.
     */
    @Test
    public void henWithoutDuplicatesThenArrayWithoutChangeDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Привет"};
        String[] expected = {"Привет", "Мир"};
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, is(expected));
    }
}
