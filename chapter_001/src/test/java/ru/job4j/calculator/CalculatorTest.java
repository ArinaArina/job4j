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
public class CalculatorTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        assertThat(calc.getResult(), closeTo(2D, 0.1));
    }

    /**
     * Test sub.
     */
    @Test
    public void whenSub2Minus1Then1()  {
        Calculator calc = new Calculator();
        calc.sub(2D, 1D);
        assertThat(calc.getResult(), closeTo(1D, 0.1));
    }

    /**
     * Test div.
     */
    @Test
    public void whenDivOneOnOneThenOne()  {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        assertThat(calc.getResult(), closeTo(1D, 0.1));
    }

    /**
     * Test div.
     */
    @Test
    public void whenDivOneOnZero()  {
        Calculator calc = new Calculator();
        calc.div(1D, 0);
        assertThat(calc.getResult(), closeTo(-1.0, 0.1));
    }

    /**
     * Test multiple.
     */
    @Test
    public void whenMultiple2On2Then4()  {
        Calculator calc = new Calculator();
        calc.multiple(2D, 2D);
        assertThat(calc.getResult(), closeTo(4D, 0.1));
    }
}
