package ru.job4j.array;

/**
 * Class Matrix.
 * @author Arina Vakurova.
 * @since 23.02.2019.
 * @version 1.
 */
public class Matrix {
    /**
     * Метод, строящий таблицу умножения размерностью size.
     * @param size - размер матрицы.
     * @return таблицу умножения.
     */
    int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                table[row][column] = (row + 1) * (column + 1);
            }
        }
        return table;
    }
}
