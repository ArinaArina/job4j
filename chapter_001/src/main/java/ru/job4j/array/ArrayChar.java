package ru.job4j.array;

/**
 * Class ArrayChar.
 * @author Arina Vakurova.
 * @since 16.02.2019.
 * @version 1.
 */
public class ArrayChar {
    /**
     * Массив, который мы будем проверять на сходство с префиксом.
     */
    private char[] data;

    /**
     * Конструктор - создание нового объекта с определенными значениями.
     * @param line - строка.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix - префикс.
     * @return true, если слово начинается с префикса и false, если нет.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int index = 0; index < value.length; index++) {
            if (value[index] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
