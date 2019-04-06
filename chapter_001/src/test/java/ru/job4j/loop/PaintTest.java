package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 13.02.2019.
 * @version 1.
 */
public class PaintTest {
    /**
     * Test leftTrl.
     */
    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4, 4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Test rightTrl.
     */
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4, 4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Test pyramid.
     */
    @Test
    public void whenHeight2Then() {
        Paint paint = new Paint();
        String ln = System.lineSeparator();
        assertThat(paint.pyramid(2),
                is(
                        new StringJoiner(ln, "", ln)
                                .add(" ^ ")
                                .add("^^^")
                                .toString()
                )
        );
    }

    /**
     * Test pyramid.
     */
    @Test
    public void whenHeight3Then() {
        Paint paint = new Paint();
        String ln = System.lineSeparator();
        assertThat(paint.pyramid(3),
                is(
                        new StringJoiner(ln, "", ln)
                                .add("  ^  ")
                                .add(" ^^^ ")
                                .add("^^^^^")
                                .toString()
                )
        );
    }

    /**
     * Test pyramid.
     */
    @Test
    public void whenHeight0Then() {
        Paint paint = new Paint();
        assertThat(paint.pyramid(0), is(""));
    }
}
