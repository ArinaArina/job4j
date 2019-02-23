package ru.job4j.array;

/**
 * Class MatrixCheck.
 * @author Arina Vakurova.
 * @since 23.02.2019.
 * @version 1.
 */
public class MatrixCheck {
    /**
     * Метод, проверяющий одинаковые ли элементы по диагоналям.
     * firstRightDiagonal - первый элемент в правой диагонали.
     * firstLeftDiagonal - первый элемент в левой диагонали.
     * @param data - исходная матрица.
     * @return результат.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean firstRightDiagonal = data[0][data.length - 1];
        boolean firstLeftDiagonal = data[0][0];
        for (int row = 1; row < data.length; row++) {
            if ((firstLeftDiagonal != data[row][row]) || (firstRightDiagonal != data[row][data.length - row - 1])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
