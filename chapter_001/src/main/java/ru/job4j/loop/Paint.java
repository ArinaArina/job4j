package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Class Paint.
 * Пирамида.
 * @author Arina Vakurova.
 * @since 13.02.2019.
 * @version 1.
 */
public class Paint {

    public String rightTrl(int height, int width) {
        return this.loopBy(
                height,
                width,
                (row, column) -> row >= column
        );
    }

    public String leftTrl(int height, int width) {
        return this.loopBy(
                height,
                width,
                (row, column) -> row >= height - column - 1
        );
    }

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
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
