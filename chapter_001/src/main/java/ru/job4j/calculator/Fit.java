package ru.job4j.calculator;

/**
 * Class Fit для вычисления идеального веса.
 * @author Arina Vakurova.
 * @since 7.02.2019.
 * @version 1.
 */
public class Fit {
    /**
     * Идеальный вес для мужщины.
     * @param height - Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}
