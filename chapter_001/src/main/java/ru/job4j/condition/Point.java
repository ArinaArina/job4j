package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Class Point находит расстояние между точками в системе координат.
 * @author Arina Vakurova.
 * @since 8.02.2019.
 * @version 1.
 */
public class Point {
    /**
     * Координата икс.
     */
    private int x;

    /**
     * Координата игрик.
     */
    private int y;

    /**
     * Конструктор - создание нового объекта с определенными значениями.
     * @param x - координата икс.
     * @param y - координата игрик.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Расстояние между точками в системе координат.
     * @param that - входящая точка.
     * @return расстояние между входящей и текущей точками.
     */
    public double distance(Point that) {
        return  sqrt(
                pow(this.x - that.x, 2) + pow(this.y - that.y, 2)
        );
    }

    /**
     * Выводит координаты точки.
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
