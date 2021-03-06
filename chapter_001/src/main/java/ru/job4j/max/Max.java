package ru.job4j.max;

/**
 * Class Max для нахождения максимума из двух чисел.
 * @author Arina Vakurova.
 * @since 9.02.2019.
 * @version 1.
 */
public class Max {
    /**
     * Находит наибольшее из двух чисел.
     * @param first - первое число.
     * @param second - второе число.
     * @return максимум.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    /**
     * Находит наибольшее из трёх чисел.
     * @param first - первое число.
     * @param second - второе число.
     * @param third - третье число.
     * @return максимум.
     */
    public int max(int first, int second, int third) {
        return (this.max(this.max(first, second), third));
    }
}
