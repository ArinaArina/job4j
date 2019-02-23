package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Arina Vakurova.
 * @since 23.02.2019.
 * @version 1.
 */
public class MatrixTest {
    /**
     * Test multiple.
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int input = 2;
        int[][] expect = {{1, 2}, {2, 4}};
        int[][] result = matrix.multiple(input);
        assertThat(result, is(expect));
    }

    /**
     * Test multiple.
     */
    @Test
    public void when0on0() {
        Matrix matrix = new Matrix();
        int input = 0;
        int[][] expect = {};
        int[][] result = matrix.multiple(input);
        assertThat(result, is(expect));
    }
}
