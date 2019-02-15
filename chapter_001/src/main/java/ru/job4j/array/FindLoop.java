package ru.job4j.array;

/**
 * Class FindLoop.
 * Классический поиск перебором.
 * @author Arina Vakurova.
 * @since 15.02.2019.
 * @version 1.
 */
public class FindLoop {
    /**
     * Ищет расположение нужного элемента в массиве.
     * Если его нет, то метод возвращает -1.
     * @param data - массив элементов.
     * @param el - искомый элемент.
     * @return индекс элемента.
     */
    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}
