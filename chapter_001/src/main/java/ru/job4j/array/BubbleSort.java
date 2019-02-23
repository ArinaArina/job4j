package ru.job4j.array;

/**
 * Class BubbleSort.
 * @author Arina Vakurova.
 * @since 23.02.2019.
 * @version 1.
 */
public class BubbleSort {
    /**
     * Сортировка массива пузырьком по возрастанию.
     * @param array - исходный массив.
     * @return - отсортированный массив.
     */
    public int[] sort(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            for (int index2 = index + 1; index2 < array.length; index2++) {
                if (array[index] > array[index2]) {
                    int temporary = array[index];
                    array[index] = array[index2];
                    array[index2] = temporary;
                }
            }
        }
        return array;
    }
}
