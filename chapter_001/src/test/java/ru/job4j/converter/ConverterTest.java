package ru.job4j.converter;

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
public class ConverterTest {
    /**
     * Test rubleToDollar.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        assertThat(converter.rubleToDollar(60), is(1));
    }

    /**
     * Test rubleToEuro.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        assertThat(converter.rubleToEuro(70), is(1));
    }

    /**
     * Test dollarToRuble.
     */
    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        assertThat(converter.dollarToRuble(1), is(60));
    }

    /**
     * Test euroToRuble.
     */
    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        assertThat(converter.euroToRuble(1), is(70));
    }
}
