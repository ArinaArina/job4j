package ru.job4j.converter;

/**
 * Class Converter.
 * Конвертер валюты.
 * @author Arina Vakurova.
 * @since 7.02.2019.
 * @version 1.
 */
public class Converter {
    /**
     * Доллар в рублях.
     */
    private static final int DOLLAR = 60;

    /**
     * Евро в рублях.
     */
    private static final int EURO = 70;

    /**
     * Конвертируем рубли в евро.
     * @param value - рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / EURO;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value - рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / DOLLAR;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value - доллары.
     * @return рубли.
     */
    public int dollarToRuble(int value) {
        return value * DOLLAR;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value - евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {
        return value * EURO;
    }
}
