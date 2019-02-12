package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 12.02.2019.
 * @version 1.
 */
public class BoardTest {
    /**
     * Test paint.
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String ln = System.lineSeparator();
        assertThat(board.paint(3, 3), is(String.format("X X%s X %sX X%s", ln, ln, ln)));
    }

    /**
     * Test paint.
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String ln = System.lineSeparator();
        assertThat(board.paint(5, 4), is(String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln)));
    }

    /**
     * Test paint.
     */
    @Test
    public void whenPaintBoardWithWidthMinusOneAndHeightMinusOneThenStringEmpty() {
        Board board = new Board();
        assertThat(board.paint(-1, -1), is(""));
    }

    /**
     * Test paint.
     */
    @Test
    public void whenPaintBoardWithWidthMinusOneAndHeightSixThenStringSixLineSeparator() {
        Board board = new Board();
        String ln = System.lineSeparator();
        assertThat(board.paint(-1, 6), is(String.format("%s%s%s%s%s%s", ln, ln, ln, ln, ln, ln)));
    }
}
