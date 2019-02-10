package ru.job4j.loop;

/**
 * Class Counter подсчитывает сумму чётных чисел в диапазоне.
 * @author Arina Vakurova.
 * @since 10.02.2019.
 * @version 1.
 */
public class Counter {
    /**
     * Подсчет суммы чётных чисел в диапазоне.
     * @param start - начало диапазона.
     * @param finish - конец диапазона.
     * @return сумма чётных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int number = start; number <= finish; number++) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
