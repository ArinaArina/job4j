package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate.
 * @author Arina Vakurova.
 * @since 6.04.2019.
 * @version 1.
 */
public class ArrayDuplicate {
    /**
     * Проверяет есть повторяющиеся слова в массиве или нет, если есть удаляет их.
     * countRecurWords - количество повторяющихся слов.
     * @param array - массив, который мы проверяем на повтор слов.
     * @return массив без повторяющихся слов.
     */
    public String[] remove(String[] array) {
        int countRecurWords = 0;
        for (int word = 0; word < array.length - countRecurWords; word++) {
            for (int word2 = word + 1; word2 < array.length - countRecurWords; word2++) {
                if (array[word].equals(array[word2])) {
                    array[word2] = array[array.length - countRecurWords - 1];
                    countRecurWords++;
                    word2--;
                }
            }
        }
        return Arrays.copyOf(array, array.length - countRecurWords);
    }
}
