package ru.job4j.array;

/**
 * Class Check.
 * @author Arina Vakurova.
 * @since 15.02.2019.
 * @version 1.
 */
public class Check {
    /**
     * Проверяет, что все элементы в массиве являются true или false.
     * @param data - массив.
     * @return true, если все элементы одинаковы и false, если все элементы различны.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean dataFirst = data[0];
        for (int index = 1; index < data.length; index++) {
            if (data[index] != dataFirst) {
                result = false;
                break;
            }
        }
        return result;
    }
}
