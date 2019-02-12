package ru.job4j.loop;

/**
 * Class Board.
 * Шахматная доска.
 * @author Arina Vakurova.
 * @since 12.02.2019.
 * @version 1.
 */
public class Board {
    /**
     * Рисует шахматную доску из символов x и пробелов.
     * @param width - ширина доски.
     * @param height -высота доски.
     * @return нарисованная шахматная доска.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
