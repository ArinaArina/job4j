package ru.job4j.condition;

/**
 * Class Triangle находит площадь треугольника.
 * @author Arina Vakurova.
 * @since 9.02.2019.
 * @version 1.
 */
public class Triangle {
    /**
     * Точка a.
     */
    private Point a;
    /**
     * Точка b.
     */
    private Point b;
    /**
     * Точка c.
     */
    private Point c;

    /**
     * Конструктор - создание нового объекта с определенными значениями.
     * @param a - точка a.
     * @param b - точка b.
     * @param c - точка c.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Проверяет, можно ли построить треугольник с данными сторонами.
     * @param ab - длина от точки a до точки b.
     * @param ac - длина от точки a до точки c.
     * @param bc - длина от точки b до точки c.
     * @return true, если треугольник существует или false, если треугольника нет.
     */
    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && bc + ab > ac;
    }

    /**
     * Находит полупериметр по длинам сторон.
     * @param ab - расстояние между точками a и b.
     * @param ac - расстояние между точками a и c.
     * @param bc - расстояние между точками b и c.
     * @return полупериметр.
     */
    public double period(double ab, double ac, double bc) {
        double p = (ab + ac + bc) / 2;
        if (p <= 0) {
            p = -1.0;
        }
        return p;
    }

    /**
     * Находит площадь треугольника.
     * @return площадь треугольника, если треугольник существует или -1, если треугольника нет.
     */
    public double area() {
        double ab = this.a.distance(b);
        double ac = this.a.distance(c);
        double bc = this.b.distance(c);
        double p = this.period(ab, ac, bc);
        return ((this.exist(ab, ac, bc)) ? (Math.sqrt(p * (p - ab) * (p - ac) * (p - bc))) : -1.0);
    }
}
