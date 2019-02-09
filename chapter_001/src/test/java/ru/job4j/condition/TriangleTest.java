package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 9.02.2019.
 * @version 1.
 */
public class TriangleTest {
    /**
     * Test area.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area(), closeTo(2.0, 0.1));
    }

    /**
     * Test area.
     */
    @Test
    public void whenPointsAreEqualThenTheTriangleDoesNotExist() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area(), closeTo(-1.0, 0.1));
    }

    /**
     * Test exist.
     */
    @Test
    public void whenSideTriangleLessSumTwoOtherSides() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.exist(3, 5, 6), is(true));
    }

    /**
     * Test exist.
     */
    @Test
    public void whenSideTriangleMoreSumTwoOtherSides() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.exist(6, 18, 11), is(false));
    }

    /**
     * Test period.
     */
    @Test
    public void whenSumSidesNegativeThenPerimeterNot() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.period(1, 2, -4), closeTo(-1.0, 0.1));
    }

    /**
     * Test period.
     */
    @Test
    public void whenSumSidesEqualsZeroThenPerimeterNot() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.period(1, 2, -3), closeTo(-1.0, 0.1));
    }

    /**
     * Test period.
     */
    @Test
    public void whenSumSidesPositive() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.period(1, 2, 3), closeTo(3.0, 0.1));
    }
}
