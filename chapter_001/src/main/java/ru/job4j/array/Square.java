package ru.job4j.array;

/**
 * Class Square заполняет массив степенями чисел.
 * @author Arina Vakurova.
 * @since 13.02.2019.
 * @version 1.
 */
public class Square {
    /**
     * Заполняет массив степенями чисел.
     * @param bound - граница массива.
     * @return заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 1; i < bound + 1; i++) {
            result[i - 1] = i * i;
        }
        return result;
    }
}
