package ru.job4j.loop;

/**
 * Class Factorial вычисляет факториал.
 * @author Arina Vakurova.
 * @since 10.02.2019.
 * @version 1.
 */
public class Factorial {
    /**
     * Вычисляет факториал.
     * @param n - положительное целое число.
     * @return факториал числа.
     */
    public int calc(int n) {
        int result = 1;
        for (int number = 1; number <= n; number++) {
            result *= number;
        }
        return result;
    }
}
