package ru.job4j.loop;

/**
 * Class Paint.
 * Пирамида.
 * @author Arina Vakurova.
 * @since 13.02.2019.
 * @version 1.
 */
public class Paint {
    /**
     * Рисует пирамиду из символа ^ и пробелов.
     * weight - ширина пирамиды.
     * row - строка.
     * column - столбец.
     * @param height - высота пирамиды.
     * @return рисунок пирамиды.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < weight; column++) {
                if (height + row - 1 >= column && row >= height - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
