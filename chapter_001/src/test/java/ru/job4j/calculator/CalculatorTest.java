package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
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
        assertThat(calc.getResult(), is(2D));
    }

    /**
     * Test sub.
     */
    @Test
    public void whenSub2Minus1Then1()  {
        Calculator calc = new Calculator();
        calc.sub(2D, 1D);
        assertThat(calc.getResult(), is(1D));
    }

    /**
     * Test div.
     */
    @Test
    public void whenDivOneOnOneThenOne()  {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        assertThat(calc.getResult(), is(1D));
    }

    /**
     * Test div.
     */
    @Test
    public void whenDivOneOnZero()  {
        Calculator calc = new Calculator();
        calc.div(1D, 0);
        assertThat(calc.getResult(), is(-1.0));
    }

    /**
     * Test multiple.
     */
    @Test
    public void whenMultiple2On2Then4()  {
        Calculator calc = new Calculator();
        calc.mult(2D, 2D);
        assertThat(calc.getResult(), is(4D));
    }
}
