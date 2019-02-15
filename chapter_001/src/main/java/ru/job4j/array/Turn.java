package ru.job4j.array;

/**
 * Class Turn.
 * Для переворачивания массива.
 * @author Arina Vakurova.
 * @since 15.02.2019.
 * @version 1.
 */
public class Turn {
    /**
     * Переворачивает массив задом наперёд.
     * @param array - исходный массив.
     * @return перевёрнутый массив.
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temporary = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temporary;
        }
        return array;
    }
}
